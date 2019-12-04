import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
public class Close extends Application {
    Stage primarystage;
    public void start(Stage primarystage)throws Exception
    {
        this.primarystage=primarystage;
        Button b1=new Button("close");
        primarystage.show();
        primarystage.setOnCloseRequest(e->
        {
            e.consume();
            close();
        });
        StackPane layout=new StackPane();
        layout.getChildren().add(b1);
        primarystage.setTitle("Closable");
        primarystage.setResizable(false);
        Scene s1=new Scene(layout,300,300);
        primarystage.setScene(s1);
        b1.setOnAction(e ->
        {
            close(); 
        }); 
    }
    void close()
    {
        boolean result=ConfirmBox.display("confirm!","Do you want to Exit!");
        if(result)
        {
            System.out.println("All files are saved !!!");
            primarystage.close();
        }
    }
            
    public static void main(String[] args) {
        launch(args);
    }    
}
