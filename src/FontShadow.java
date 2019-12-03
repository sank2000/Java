import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
public class FontShadow extends Application {
    public void start(Stage primarystage)throws Exception
    {
        Group g1=new Group();
        primarystage.show();
        primarystage.setTitle("Font FX");
        primarystage.setResizable(false);
        Text t1=new Text(50,50,"hey dude I am Santhosh");
        Font f=new Font("Serif",22);
        t1.setFont(f);
        DropShadow ds=new DropShadow();
        ds.setOffsetX(10);
        ds.setOffsetY(10);
        ds.setColor(Color.DARKGREEN);
        t1.setEffect(ds);
        g1.getChildren().add(t1);
        Scene s1=new Scene(g1,300,300,Color.ANTIQUEWHITE);
        primarystage.setScene(s1);
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
