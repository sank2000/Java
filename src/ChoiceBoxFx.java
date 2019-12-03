import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
public class ChoiceBoxFx extends Application {
    public void start(Stage primarystage)throws Exception
    {
        VBox g1=new VBox(20);
        g1.setAlignment(Pos.CENTER);
        primarystage.show();
        primarystage.setTitle("Choice FX");
        primarystage.setResizable(false);
        ChoiceBox<String> cl=new ChoiceBox<>();
        cl.getItems().add("c");
        cl.getItems().add("C++");
        cl.getItems().add("Java");
        g1.getChildren().add(cl);
        cl.getSelectionModel().selectFirst();
        cl.getSelectionModel().selectedItemProperty().addListener((v,old,new_s)->
        {
            System.out.println(old+" to "+new_s);
        });
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
