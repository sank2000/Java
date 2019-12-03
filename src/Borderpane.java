import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
public class Borderpane extends Application {
    public void start(Stage primarystage)throws Exception
    {
        Button b1=new Button("Menu");
        Button b3=new Button("About");
        Button b2=new Button("Edit");
        HBox layout1=new HBox();
        layout1.getChildren().addAll(b1,b2,b3);
        Button b4=new Button("Project");
        Button b5=new Button("Files");
        Button b6=new Button("Service");
        VBox layout2=new VBox(10);
        layout2.getChildren().addAll(b4,b5,b6);
        BorderPane layout=new BorderPane();
        layout.setTop(layout1);
        layout.setLeft(layout2);
        primarystage.show();
        primarystage.setResizable(false);
        Scene s1=new Scene(layout,300,300);
        primarystage.setScene(s1);
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
