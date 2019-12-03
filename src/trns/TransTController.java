
package trns;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Ellipse;
import javafx.util.Duration;
public class TransTController implements Initializable {

    @FXML
    private Ellipse e1;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TranslateTransition t1=new TranslateTransition();
        t1.setDuration(Duration.seconds(2));
        t1.setNode(e1);
        t1.setToX(-66);
        t1.setToY(-66);
        t1.setCycleCount(-1);
        t1.setAutoReverse(true);
        t1.play();
    }    
    
}
