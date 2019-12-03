import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Modality;
public class NewStage extends Application {
    public void start(Stage primarystage)throws Exception
    {
        Button b1=new Button("Click me!");
        StackPane layout=new StackPane();
        layout.getChildren().add(b1);
        primarystage.show();
        primarystage.setTitle("First FX");
        primarystage.setResizable(false);
        Scene s1=new Scene(layout,300,300);
        primarystage.setScene(s1);
        b1.setOnAction(e ->
        {
          Stage st1=new Stage();
          st1.initModality(Modality.APPLICATION_MODAL);
          Button b=new Button("Close");
          StackPane layout1=new StackPane();
          layout1.getChildren().add(b);
          b.setOnAction(Ev ->
          {
              st1.close();
          }  );
          Scene S=new Scene(layout1,450,450);
          st1.setScene(S);
          st1.show();
         }  );
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
