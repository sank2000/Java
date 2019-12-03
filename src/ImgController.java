/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author San
 */
public class ImgController implements Initializable {

    @FXML
    private ImageView iv;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image img=new Image("/img/11.jpg");
        iv.setImage(img);
        
        }    
    
}
