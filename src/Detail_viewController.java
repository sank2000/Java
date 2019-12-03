import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;

public class Detail_viewController implements Initializable {

    Product p;
    Stage current;
    File id;
    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;
  
    @FXML
    private Button cb;
    
    @FXML
    private ImageView iv;
    public void close()
    {
        current.close();
    }
    public void change()
    {
        FileChooser f= new FileChooser();
        f.setTitle("open Image");
        id=f.showOpenDialog(current);
        try
        {
          BufferedImage b1=ImageIO.read(id);
          Image img2 = SwingFXUtils.toFXImage(b1, null);
          iv.setImage(img2);
        }
        catch(Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public void initdata(Product per,Stage s)
    {
        p=per;
        current=s;
        l1.setText(p.getName());
        l2.setText(String.valueOf(p.getPrice()));
        l3.setText(String.valueOf(p.getQuantity()));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       Image img=new Image("/img/11.jpg");
        iv.setImage(img);
    }    
    
}
