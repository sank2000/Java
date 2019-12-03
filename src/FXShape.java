import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
public class FXShape extends Application {
    public void start(Stage primarystage)throws Exception
    {
        Group g1=new Group();
        primarystage.show();
        primarystage.setTitle("Shapes FX");
        primarystage.setResizable(false);
        Line l1=new Line(20,20,200,10);
        l1.setStroke(Color.CHOCOLATE);
        g1.getChildren().add(l1);
        Ellipse e=new Ellipse(75,75,25,50);
        e.setStroke(Color.BLACK);
        e.setFill(Color.AQUAMARINE);
        g1.getChildren().add(e);
        QuadCurve c=new QuadCurve(30,200,50,100,130,220);
        c.setStroke(Color.BLACK);
        c.setFill(Color.AQUAMARINE);
        g1.getChildren().add(c);
        Scene s1=new Scene(g1,300,300,Color.ANTIQUEWHITE);
        primarystage.setScene(s1);
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
