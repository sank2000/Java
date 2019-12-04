import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
public class NewClass extends Application {
    
    public void start(Stage primarystage)throws Exception
    {
        Parent root=FXMLLoader.load(getClass().getResource("1.fxml"));
        primarystage.setTitle("Random FX");
        primarystage.setResizable(false);
        Scene s1=new Scene(root);
        primarystage.setScene(s1);
        primarystage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
