import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.*;
public class Binding extends Application {
    public void start(Stage primarystage)throws Exception
    {
        TextField f1=new TextField();
        f1.setMaxWidth(120);
        Label l1=new Label("Binding");
        TextField f2=new TextField();
        f2.setMaxWidth(120);
        VBox layout=new VBox(20);
        f2.textProperty().bindBidirectional(f1.textProperty());
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(f1,l1,f2);
        primarystage.show();
        primarystage.setTitle("Binding FX");
        primarystage.setResizable(false);
        Scene s1=new Scene(layout,300,300);
        primarystage.setScene(s1);
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
