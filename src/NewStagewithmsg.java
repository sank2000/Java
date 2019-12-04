import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
public class NewStagewithmsg extends Application {
    public void start(Stage primarystage)throws Exception
    {
        boolean result;
        Button b1=new Button("Click me!");
        primarystage.show();
        StackPane layout=new StackPane();
        layout.getChildren().add(b1);
        primarystage.setTitle("Stage with Return");
        primarystage.setResizable(false);
        Scene s1=new Scene(layout,300,300);
        primarystage.setScene(s1);
        b1.setOnAction(e ->
        {
            System.out.println(Stage2.start());
        });
         
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
