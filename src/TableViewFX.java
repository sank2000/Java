import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
public class TableViewFX extends Application {
    TableView<Product> table ;
    public void start(Stage primarystage)throws Exception
    {
        VBox g1=new VBox(20);
        g1.setPadding(new Insets(10));
        g1.setAlignment(Pos.CENTER);
        
        TableColumn<Product,String> namecolumn=new TableColumn<>("Name");
        namecolumn.setMinWidth(200);
        namecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
       
        TableColumn<Product,Integer> pricecolumn=new TableColumn<>("Price");
        pricecolumn.setMinWidth(100);
        pricecolumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        
        TableColumn<Product,Integer> quantitycolumn=new TableColumn<>("Quantity");
        quantitycolumn.setMinWidth(100);
        quantitycolumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
            
        table=new TableView<>();
        table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        
        table.setItems(getProduct());
        table.getColumns().addAll(namecolumn,pricecolumn,quantitycolumn);
            
        TextField f1=new TextField();
        f1.setPromptText("NAME OF THE BOOK");
        TextField f2=new TextField();
        f2.setPromptText("PRICE");
        TextField f3=new TextField();
        f3.setPromptText("QUANTITY");
        
        Button b1=new Button("ADD");
        Button b2=new Button("DELETE");
        Button b3=new Button("DETAILED VIEW");
        b3.setDisable(true);
        table.setOnMouseClicked(e ->
        {
            b3.setDisable(false);
        });
        b1.setOnAction(e ->
        {
            Product p=new Product();
            p.setName(f1.getText());
            p.setPrice(Integer.parseInt(f2.getText()));
            p.setQuantity(Integer.parseInt(f3.getText()));
            table.getItems().add(p);
            f1.clear();
            f2.clear();
            f3.clear();
        });
        
        b2.setOnAction(e->
        {
            ObservableList<Product> full,selected;
            full=table.getItems();
            selected = table.getSelectionModel().getSelectedItems();
            full.removeAll(selected);
        });
        
        b3.setOnAction(e->
        {
            Stage stage=new Stage();
            try
            {
                FXMLLoader root=new FXMLLoader();
                root.setLocation(getClass().getResource("Detail_view.fxml"));
                Parent root1 =root.load();
                Detail_viewController c = root.getController();
                c.initdata(table.getSelectionModel().getSelectedItem(),stage);
                Scene sc=new Scene(root1);
                stage.setScene(sc);
                stage.show();
            }
            catch(Exception ex){
                System.out.println(ex);
                ex.printStackTrace();
            }
        });
        
        HBox l1=new HBox(10);
        HBox l2=new HBox(20);
        l1.getChildren().addAll(f1,f2,f3);
        l2.getChildren().addAll(b1,b2,b3);
        g1.getChildren().addAll(table,l1,l2);
        primarystage.show();
        primarystage.setTitle("Table View FX");
        primarystage.setResizable(false);
        Scene s1=new Scene(g1);
        primarystage.setScene(s1);
    }
    public static void main(String[] args) {
        launch(args);
    } 
    public ObservableList<Product> getProduct()
    {
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("C",150,200));
        products.add(new Product("C++",250,250));
        products.add(new Product("java",500,400));
        products.add(new Product("Kotlin",100,150));
        products.add(new Product("Python",50,250));
        products.add(new Product("C#",10,20));
        return products;
    }
}
