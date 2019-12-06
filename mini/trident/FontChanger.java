package trident;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class FontChanger 
{
    public  Font recieve(Font f)throws Exception
    {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.getIcons().add(new Image("/trident/img/trident.png"));
        FXMLLoader root=new FXMLLoader();
        root.setLocation(getClass().getResource("Font.fxml"));
        Parent root1 =root.load();
        FontController c = root.getController();
        c.setS(window,f);
        window.setTitle("Font");
        window.setResizable(false);
        Scene s1=new Scene(root1);
        window.setScene(s1);
        window.showAndWait();
        return c.ft;
    }
    
}
