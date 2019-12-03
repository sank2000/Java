import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
public class Gridpane extends Application {
    public void start(Stage primarystage)throws Exception
    {
        GridPane layout=new GridPane();
        layout.setPadding(new Insets(20,20,20,20));
        layout.setVgap(10);
        layout.setHgap(10);
        Label l1=new Label("User Name");
        GridPane.setConstraints(l1, 0, 0);
        TextField f1=new TextField("san");
        GridPane.setConstraints(f1, 1, 0);
        Label l2=new Label("Password");
        GridPane.setConstraints(l2, 0, 1);
        TextField f2=new TextField();
        f2.setPromptText("password");
        GridPane.setConstraints(f2, 1, 1);
        Button b1=new Button("login");
        GridPane.setConstraints(b1, 1, 2);
        layout.getChildren().addAll(l1,f1,l2,f2,b1);
        primarystage.show();
        primarystage.setResizable(false);
        Scene s1=new Scene(layout,300,300);
        primarystage.setScene(s1);
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
