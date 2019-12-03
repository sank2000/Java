import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
public class ComboBoxFx extends Application {
    public void start(Stage primarystage)throws Exception
    {
        VBox g1=new VBox(20);
        g1.setAlignment(Pos.CENTER);
        primarystage.show();
        primarystage.setTitle("Combo box FX");
        primarystage.setResizable(false);
        ComboBox<String> cl=new ComboBox<>();
        cl.getItems().addAll("C","C++","java","python");
        g1.getChildren().add(cl);
        cl.setPromptText("KNOWN PROGRAMMING LANGUAGE");
 //       cl.setEditable(true);
        cl.setOnAction(e-> System.out.println(cl.getValue()));
//        Button b1=new Button("Click!");
//        b1.setOnAction(e->
//        {
//            System.out.println(cl.getValue());
//        });
//        g1.getChildren().add(b1);
        Scene s1=new Scene(g1,300,300);
        primarystage.setScene(s1);
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
