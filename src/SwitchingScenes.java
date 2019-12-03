import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
public class SwitchingScenes extends Application {
    public void start(Stage primarystage)throws Exception
    {
        Button b1=new Button("Move to back!");
        StackPane layout=new StackPane();
        layout.getChildren().add(b1);
        Button b2=new Button("Move to front!");
        StackPane layout2=new StackPane();
        layout2.getChildren().add(b2);       
        primarystage.show();
        primarystage.setTitle("First FX");
        primarystage.setResizable(false);
        Scene s1=new Scene(layout,300,300);
        Scene s2=new Scene(layout2,500,500);
        b1.setOnAction(e ->
        {
          primarystage.setScene(s2);
          System.out.println("Now you are in backside");
         }  );
        b2.setOnAction(e ->
        {
          primarystage.setScene(s1);
          System.out.println("Now you are in Frondside");
         }  );
        primarystage.setScene(s1);
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
