import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.TreeView;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.VBox;
public class TreeViewFx extends Application {
    TreeView<String> tree;
    public void start(Stage primarystage)throws Exception
    {
        TreeItem<String> b1,sb1,b2,root=new TreeItem<>();
        root.setExpanded(true);
        VBox g1=new VBox(20);
        g1.setPadding(new Insets(50));
        g1.setAlignment(Pos.CENTER);
        
        b1=makebranch("Branch 1",root);
        makebranch("sub 1",b1);
        makebranch("sub 2",b1);
        makebranch("sub 3",b1);
         
        sb1=makebranch("Branch 1",b1);
        makebranch("sub 1",sb1);
        makebranch("sub 2",sb1);
        makebranch("sub 2",sb1);
         
        b2=makebranch("Branch 2",root);
        makebranch("sub 1",b2);
        makebranch("sub 2",b2);
        makebranch("sub 3",b2);
        
        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty().addListener((v,old,new_s)->
        {
            if(old != null && new_s != null)
             System.out.println(old.getValue()+" to "+new_s.getValue());
        });
        g1.getChildren().add(tree);
        primarystage.show();
        primarystage.setTitle("Tree FX");
        primarystage.setResizable(false);;
        Scene s1=new Scene(g1,300,300);
        primarystage.setScene(s1);
    }
    public static void main(String[] args) {
        launch(args);
    }   
    public TreeItem<String> makebranch(String name,TreeItem<String> parent)
    {
        TreeItem<String> item =new  TreeItem<>(name);
        parent.getChildren().add(item);
        return item;
        
    }
}
