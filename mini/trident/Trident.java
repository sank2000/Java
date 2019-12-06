package trident;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Trident extends Application {
    
    @Override
    public void start(Stage stage) throws Exception 
    {
        //FileInputStream i=new FileInputStream("E:\\Codes\\NetBeansProjects\\Trident\\src\\trident\\img\\trident.png");
        Image img=new Image("/trident/img/trident.png");
        FXMLLoader root=new FXMLLoader();
        root.setLocation(getClass().getResource("FXMLDocument.fxml"));
        Parent root1 =root.load();
        FXMLDocumentController c = root.getController();
        c.setss(stage, root1);
        Scene scene = new Scene(root1);
        stage.setTitle("Trident Text Editor");
        stage.getIcons().add(img);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
