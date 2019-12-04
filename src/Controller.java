
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class Controller 
{
    @FXML
    Label mymsg;
    public void handleButtonAction(ActionEvent event)
    {
        Random obj=new Random();
        mymsg.setText(Integer.toString(obj.nextInt(100)));
    }
}
