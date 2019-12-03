/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trns;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author San
 */
public class RotateController implements Initializable {

   @FXML
    private Rectangle c1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        RotateTransition rt=new RotateTransition(Duration.seconds(2),c1);
//        rt.setFromAngle(0);
//        rt.setToAngle(360);
        rt.setByAngle(360);
        rt.setAutoReverse(true);
        rt.setCycleCount(RotateTransition.INDEFINITE);
        rt.play();
        
    }    
    
}
