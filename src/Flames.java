import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
public class Flames extends Application {
    
    public void start(Stage primarystage)throws Exception
    {
        Parent root=FXMLLoader.load(getClass().getResource("flames.fxml"));
        primarystage.setTitle("Flames");
        primarystage.setResizable(false);
        Scene s1=new Scene(root);
        primarystage.setScene(s1);
        primarystage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
