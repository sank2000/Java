import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FileProperController implements Initializable {

    @FXML
    private Label name;

    @FXML
    private Label type;

    @FXML
    private Label size;

    @FXML
    private Label modify;

    @FXML
    private Label location;
   
    void setP(File F)
    {
        if(F == null)
        {
            name.setText("---------");
            type.setText("---------");
            location.setText("---------");
            modify.setText("---------");
            size.setText("---------");
            
        }
        else
        {
            name.setText(F.getName());
            type.setText("Text File");
            location.setText(F.getAbsolutePath());
            modify.setText(new Date(F.lastModified()) + "");
            size.setText(((F.length() / 1024) + " KB (" + F.length() + " B)"));
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
}
