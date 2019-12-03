import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
public class Properties extends Application {
    public void start(Stage primarystage)throws Exception
    {
        Button b1=new Button("Click me!");
        StackPane layout=new StackPane();
        Person p1=new Person();
        p1.strProperty().addListener((v,old,new_s)->
        {
            System.out.println("new_s = " + new_s);
            System.out.println("old = " + old);
            System.out.println("v = " + v);
            System.out.println(p1.strProperty());
        });
        layout.getChildren().add(b1);
        b1.setOnAction(e->
        {
            p1.setStr("san");
        });
        primarystage.show();
        primarystage.setTitle("Properties");
        primarystage.setResizable(false);
        Scene s1=new Scene(layout,300,300);
        primarystage.setScene(s1);  
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
