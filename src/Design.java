import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.control.*;
public class Design extends Application {
    public void start(Stage primarystage)throws Exception
    {
        VBox layout=new VBox(20);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);
        Label l1=new Label("User Name");
        //l1.setStyle("-fx-text-fill: #00ccff");
        l1.setId("bold-label");
        TextField t1=new TextField();
        HBox la1=new HBox(25);
        la1.getChildren().addAll(l1,t1);
        layout.getChildren().add(la1);
        
        Label l2=new Label("Password ");
        TextField t2=new TextField();
        HBox la2=new HBox(25);
        la2.getChildren().addAll(l2,t2);
        layout.getChildren().add(la2);
        
        Button b1=new Button("Login");
        layout.getChildren().add(b1);
        
        Button b2=new Button("SIGN UP");
        b2.getStyleClass().add("red_button");
        layout.getChildren().add(b2);
        
        primarystage.show();
        primarystage.setTitle("Login");
        primarystage.setResizable(false);
        Scene s1=new Scene(layout,300,300);
    //    s1.getStylesheets().add("viper.css");
        s1.getStylesheets().add(getClass().getResource("viper.css").toExternalForm());
        primarystage.setScene(s1);
        b1.setOnAction(e ->
        {
          System.out.println("Successfull");
      //    setUserAgentStylesheet(STYLESHEET_CASPIAN);
         }  );
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
