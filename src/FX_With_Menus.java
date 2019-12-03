import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
public class FX_With_Menus extends Application {
    MenuBar m=new MenuBar();
    public void start(Stage primarystage)throws Exception
    {
        BorderPane lay=new BorderPane();
        Menu fmenu=new Menu("FILE");
        fmenu.getItems().add(new MenuItem("NEW..."));
        fmenu.getItems().add(new MenuItem("OPEN..."));
        fmenu.getItems().add(new SeparatorMenuItem());
        fmenu.getItems().add(new MenuItem("SAVE..."));
        fmenu.getItems().add(new SeparatorMenuItem());
        fmenu.getItems().add(new MenuItem("EXIT..."));
        m.getMenus().add(fmenu);
        
        Menu emenu=new Menu("_Edit");
        Menu des=new Menu("Design");
        MenuItem m1=new MenuItem("Super");
        emenu.getItems().add(des);
        des.getItems().add(m1);
        m1.setOnAction(e -> System.out.println("Super design enabled"));
        emenu.getItems().add(new MenuItem("CUT"));
        emenu.getItems().add(new MenuItem("COPY"));
        MenuItem ps=new MenuItem("PASTE");
        ps.setDisable(true);
        emenu.getItems().add(ps);
        CheckMenuItem cmt=new CheckMenuItem("Editable");
        cmt.setOnAction(e ->
        {
            if(cmt.isSelected())
                System.out.println("Now you can edit");
            else
                System.out.println("You cannot edit this thing");
        });
        emenu.getItems().add(cmt);
        m.getMenus().add(emenu);
        
        Menu level=new Menu("Level");
        ToggleGroup g=new ToggleGroup();
        RadioMenuItem rm1=new RadioMenuItem("Easy");
        rm1.setToggleGroup(g);
        RadioMenuItem rm2=new RadioMenuItem("Normal");
        rm2.setToggleGroup(g);
        RadioMenuItem rm3=new RadioMenuItem("HArd");
        rm3.setToggleGroup(g);
        level.getItems().addAll(rm1,rm2,rm3);
        m.getMenus().add(level);
        lay.setTop(m);
        primarystage.show();
        primarystage.setTitle("MENU EXAMPLE");
        primarystage.setResizable(false);;
        Scene s1=new Scene(lay,300,300);
        primarystage.setScene(s1);
    }
    public static void main(String[] args) {
        launch(args);
    }   
}
