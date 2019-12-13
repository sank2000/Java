import java.awt.Desktop;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class AboutController implements Initializable {

    @FXML
    void clicked(ActionEvent event)throws Exception 
    {
           Desktop d= Desktop.getDesktop();
           d.browse(new URI("https://github.com/sank2000/Java-Garbage/tree/master/mini/trident"));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
