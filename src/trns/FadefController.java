package trns;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

public class FadefController implements Initializable {

    @FXML
    private Polygon p1;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FadeTransition st=new FadeTransition(Duration.seconds(5));
        st.setNode(p1);
        st.setFromValue(10);
        st.setToValue(0.1);
        st.setAutoReverse(true);
        st.setCycleCount(-1);
        st.play();
    }    
    
}
