package trns;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TransitionJAVAfx extends Application {
    
    @Override
    public void start(Stage primaryStage)throws Exception {
        Parent root=FXMLLoader.load(getClass().getResource("Path_T.fxml"));
        Scene scene = new Scene(root, 500,500);       
        primaryStage.setTitle("Transition java!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
