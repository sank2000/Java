
package trns;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FillTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

public class Fill_TController implements Initializable {

    @FXML
    private Polygon t1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FillTransition st=new FillTransition(Duration.seconds(5));
        st.setShape(t1);
        st.setFromValue(Color.BLACK);
        st.setToValue(Color.FUCHSIA);
        st.setAutoReverse(true);
        st.setCycleCount(-1);
        st.play();
    }    
    
}
