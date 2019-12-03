import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
public class ListViewFx extends Application {
    public void start(Stage primarystage)throws Exception
    {
        VBox g1=new VBox(20);
        g1.setPadding(new Insets(20,20,20,20));
        g1.setAlignment(Pos.CENTER);
        primarystage.show();
        primarystage.setTitle("ListView FX");
        primarystage.setResizable(false);
        ListView<String> l=new ListView<>();
        l.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        l.setMaxSize(175, 175);
        l.getItems().add("c");
        l.getItems().add("C++");
        l.getItems().add("Java");
        g1.getChildren().add(l);
        Button b1=new Button("Click!");
        b1.setOnAction(e->
        {
            ObservableList<String> msg=l.getSelectionModel().getSelectedItems();
            System.out.println("\n\nThe selected items are:");
            for(String i:msg)
              System.out.println(i);
        });
        g1.getChildren().add(b1);
        Scene s1=new Scene(g1,300,300);
        primarystage.setScene(s1);
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
