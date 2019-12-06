
package trident;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontController implements Initializable {
    public Font ft;
    Stage s;
    
    @FXML
    private RadioButton italic;
    
    @FXML
    private Slider size;
    
    @FXML
    private ComboBox<String> font;
    
    @FXML
    private ToggleGroup g1;
    
    @FXML
    private Button ok;
    
    @FXML
    private ListView<String> style;

    @FXML
    private ComboBox<Integer> number;
    
    @FXML
    private CheckBox def;

    @FXML
    private Button close;
    
    @FXML
    public void defaultF()
    {
        if(def.isSelected())
        {
            ft= Font.font("Berlin Sans FB",FontWeight.NORMAL,FontPosture.ITALIC,16);
            font.setValue(ft.getName());
            size.setValue(ft.getSize());
            number.setValue((int)ft.getSize());
            style.getSelectionModel().select(ft.getStyle());
            font.setDisable(true);
            number.setDisable(true);
            style.setDisable(true);
            size.setDisable(true);
            italic.setDisable(true);
        }
        else
        {
            font.setDisable(false);
            number.setDisable(false);
            style.setDisable(false);
            size.setDisable(false);
            italic.setDisable(false);
            
        }
    }
    
    @FXML
    public void ok()
    {
        double v = size.getValue();
        String t = font.getValue();
        String p="REGULAR";
        if(italic.isSelected())
            p="ITALIC";
        String t1= style.getSelectionModel().getSelectedItem();
        ft= Font.font(t,FontWeight.findByName(t1),FontPosture.findByName(p),v);
        s.close();                        
    }
    
    @FXML
    public void close()
    {
        s.close();
    }
    public void setS(Stage stage,Font f)
    {
        s=stage;
        ft=f;
        def.setSelected(false);
        font.setValue(ft.getName());
        size.setValue(ft.getSize());
        number.setValue((int)ft.getSize());
        style.getSelectionModel().select(ft.getStyle());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        ObservableList<String> f= FXCollections.observableArrayList(Font.getFontNames());
        ObservableList<String> s= FXCollections.observableArrayList();
        ObservableList<Integer> num= FXCollections.observableArrayList();
        num.addAll(1,2,4,6,8,10,12,16,32,36,48,64,72,90,96);
        s.addAll("Regular","Bold","BLACK","BOLD","EXTRA_BOLD","EXTRA_LIGHT","LIGHT","MEDIUM","NORMAL","SEMI_BOLD","THIN");
        number.getItems().addAll(num);
       
        font.getItems().addAll(f);
      
        number.valueProperty().addListener((e,o,n)->
        {
            size.setValue(Double.valueOf(n));
        });
        size.valueProperty().addListener((e,o,n)->
        {
             number.setValue(n.intValue());
        });
        style.getItems().addAll(s);
    }
    
}
