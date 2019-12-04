import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class Stage2 
{ 
    static boolean result;
    public static boolean start()
    {
        Stage st1=new Stage();
        st1.initModality(Modality.APPLICATION_MODAL);
        Label l1=new Label("Do you confirm !!!");
        Button b=new Button("yes");
        Button b2=new Button("No");
        VBox layout1=new VBox(10);
        layout1.setAlignment(Pos.CENTER);
        layout1.getChildren().add(l1);
        layout1.getChildren().add(b);
        layout1.getChildren().add(b2);
        b.setOnAction(Ev ->
        {
            result=true;
            st1.close();
        }  );
        b2.setOnAction(Ev ->
        {
            result=false;
            st1.close();
        }  );
        Scene S=new Scene(layout1);
        st1.setScene(S);
        st1.showAndWait();
        return result;
    }
}
