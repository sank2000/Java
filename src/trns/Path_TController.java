package trns;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class Path_TController implements Initializable {

   @FXML
   private Circle c;

    @FXML
    private Path p;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        PathTransition st=new PathTransition(Duration.seconds(5),p,c);
        st.setAutoReverse(true);
        st.setCycleCount(-1);
        st.play();
    }    
    
}
