package trns;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Circle;

public class ScaleTController implements Initializable {
    @FXML
    private Circle c1;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ScaleTransition st=new ScaleTransition();
        st.setNode(c1);
        st.setToX(-1);
        st.setToY(-1);
        st.setAutoReverse(true);
        st.setCycleCount(-1);
        st.play();
    }    
    
}
