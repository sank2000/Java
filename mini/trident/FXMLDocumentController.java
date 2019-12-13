import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
  
    Stage s;
    Parent p;
    File f1=null;
    FileChooser fc;
    Font fnt;
    String Title="Trident Text Editor",fname;
    AlertType savemsg;
    Alert alert;
    
    @FXML
    private MenuBar Menu;
    
    @FXML
    private TextArea textArea;
    
    @FXML
    private Label status;
    
    @FXML
    private MenuItem newM;
    
    @FXML
    private MenuItem open;

    @FXML
    private MenuItem save;

    @FXML
    private MenuItem saveAs;

    @FXML
    private MenuItem close;

    @FXML
    private MenuItem exit;
    
    @FXML
    private CheckMenuItem Mode;
    
    @FXML
    private CheckMenuItem wrap;

    @FXML
    private MenuItem cut;

    @FXML
    private MenuItem copy;

    @FXML
    private MenuItem paste;
    
    @FXML
    private MenuItem undo;

    @FXML
    private MenuItem redo;
    
    @FXML
    private Label edit;

    @FXML
    private Label pos;
    // to create a new file
    @FXML
    public void newf(ActionEvent event) 
    {
        boolean result;
        if(s.getTitle().contains("*"))
        {
            result=ConfirmBox.display("confirm!","Do you want to save this file!");
            if(result)
                try{
                    save();
                }catch(Exception e){}
        }
        textArea.setEditable(true);
        edit.setText("true");
        textArea.setText("");
        status.setText("Unsaved New File");
        f1=null;
        s.setTitle(Title+"- untitled");
        save.setDisable(false);
        saveAs.setDisable(false);
        close.setDisable(false);
        cut.setDisable(false);
        copy.setDisable(false);
        paste.setDisable(false);
    }
    // to open a file.....
    @FXML
    public void open (ActionEvent event) throws Exception
    {
        int ch;boolean result;
        File temp;
        if(s.getTitle().contains("*"))
        {
            result=ConfirmBox.display("confirm!","Do you want to save this file!");
            if(result)
                try{
                save();
                }catch(Exception e){}
        }
        Menu.setDisable(true);
        textArea.setDisable(true);
        fc.setTitle("Open");
        fc.getExtensionFilters().clear();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text doc(*.txt)","*.txt"));
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("All files","*.*"));
        temp=f1;
        f1=fc.showOpenDialog(null);
        if(f1==null)
        {
            Menu.setDisable(false);
            textArea.setDisable(false);
            return;
        }
        fname=f1.getName();
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String contents = "";
        ch=br.read();
        while(ch != -1)
        {
            contents+=(char)ch;
            ch=br.read();
        }
        textArea.setText(contents); 
        textArea.setEditable(true);
        edit.setText("true");
        status.setText("File Opened");
        s.setTitle(Title+" - "+ fname);
        save.setDisable(false);
        saveAs.setDisable(false);
        close.setDisable(false);
        cut.setDisable(false);
        copy.setDisable(false);
        paste.setDisable(false);
        Menu.setDisable(false);
        textArea.setDisable(false);
    }
    // to save a file
     @FXML
     public void save()throws Exception
     {
        if(f1==null)
        {
            fc.setTitle("Save");
            fc.setInitialFileName("*.txt");
            fc.getExtensionFilters().clear();
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text doc(*.txt)","*.txt"));
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("All files","*.*"));
            Menu.setDisable(true);
            textArea.setDisable(true);
            f1=fc.showSaveDialog(null);
            if(f1==null)
            {
                Menu.setDisable(false);
                textArea.setDisable(false);
                return;
            }
            fname=f1.getName();
        }
        String contents = textArea.getText();
        FileWriter fileWritter = new FileWriter(f1, false);
        BufferedWriter bw = new BufferedWriter(fileWritter);
        bw.write(contents);
        status.setText("Saved");
        s.setTitle(Title+" - "+ fname);
        bw.close();
        Menu.setDisable(false);
        textArea.setDisable(false);
        alert.showAndWait();
     }
     // to perform saveas operation
     @FXML
     public void saveAs()throws Exception
     {
        fc.setTitle("Save as");
        fc.getExtensionFilters().clear();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text doc(*.txt)","*.txt"));
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("All files","*.*"));
        fc.setInitialFileName("*.txt");
        Menu.setDisable(true);
        textArea.setDisable(true);
        f1=fc.showSaveDialog(null);
        if(f1==null)
        {
            Menu.setDisable(false);
            textArea.setDisable(false);
            return;
        }
        fname=f1.getName();
        String contents = textArea.getText();
        FileWriter fileWritter = new FileWriter(f1, false);
        BufferedWriter bw = new BufferedWriter(fileWritter);
        bw.write(contents);
        status.setText("Saved");
        s.setTitle(Title+" - "+ fname);
        bw.close();
        Menu.setDisable(false);
        textArea.setDisable(false);
        alert.showAndWait();
     }
     // to perform close operation
     @FXML
     public void close()
    {
        boolean result;
        if(s.getTitle().contains("*"))
        {
            result=ConfirmBox.display("confirm!","Do you want to save this file!");
            if(result)
                try{
                save();
                }catch(Exception e){}
        }
        f1=null;
        textArea.setText("");
        textArea.setEditable(false);
        edit.setText("false");
        status.setText("Welcome");
        pos.setText("");
        s.setTitle(Title);
        save.setDisable(true);
        saveAs.setDisable(true);
        close.setDisable(true);
        cut.setDisable(true);
        copy.setDisable(true);
        paste.setDisable(true);
        undo.setDisable(true);
        redo.setDisable(true);
    }
    @FXML
    void exit(ActionEvent event)
    {
        s.close();
    }
    @FXML
    void copy()
    {
        textArea.copy();
    }
    @FXML
    void paste()
    {
        textArea.paste();
    }
    @FXML
    void cut()
    {
        textArea.cut();
    }
    @FXML
    void undo()
    {
        textArea.undo();
        redo.setDisable(false);
    }
    @FXML
    void redo()
    {
        textArea.redo();
    }
     @FXML
    void ModeAction(ActionEvent event) 
    {
        if(Mode.isSelected())
        {
            textArea.setBlendMode(BlendMode.DIFFERENCE);
            Menu.setBlendMode(BlendMode.DIFFERENCE);
        }
        else
        {
            textArea.setBlendMode(BlendMode.DARKEN);
            Menu.setBlendMode(BlendMode.DARKEN);
        }

    }
    // to perform wrap operation
    @FXML
    public void wrap()
    {
        if(wrap.isSelected())
            textArea.setWrapText(true);
        else
            textArea.setWrapText(false);
    }
    @FXML
    void font()throws Exception
    {
        FontChanger f=new FontChanger();
        fnt=f.recieve(fnt);
        textArea.setFont(fnt);
    }
    @FXML
    void change(KeyEvent event)
    {
        undo.setDisable(false);
        if(textArea.isEditable())
            pos.setText(String.valueOf(textArea.getCaretPosition()));
        else
        {
            pos.setText("");
            try {
                welcome();
            } catch (Exception ex) {}
        }
        
    }
    @FXML
    void mouseClick(MouseEvent event) 
    {
        if(textArea.isEditable())
            pos.setText(String.valueOf(textArea.getCaretPosition()));
        else
        {
            pos.setText("");
            try {
                welcome();
            } catch (Exception ex) {}
        }
    }
    // to create Welcome Message
    void welcome() throws Exception
    {
        Stage n1=new Stage();
        n1.getIcons().add(new Image("/img/trident.png"));
        n1.initModality(Modality.APPLICATION_MODAL);
        Parent root=FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        n1.setTitle("Welcome!");
        n1.setResizable(false);
        Scene s1=new Scene(root);
        n1.setScene(s1);
        n1.showAndWait();
    }
    //to set stage and parent
    public void setss(Stage s,Parent P)
    {
        this.s=s;
        this.p=P;
        this.s.setOnCloseRequest(c->
        {
            boolean result;
            if(s.getTitle().contains("*"))
            {
                result=ConfirmBox.display("confirm!","Do you want to save this file!");
                if(result)
                    try{
                        save();
                    }catch(Exception e){}
            }
        });
    }
    @FXML
    public void about()throws Exception
    {
        Stage n1=new Stage();
        n1.getIcons().add(new Image("/img/trident.png"));
        n1.initModality(Modality.APPLICATION_MODAL);
        Parent root=FXMLLoader.load(getClass().getResource("about.fxml"));
        n1.setTitle("About!");
        n1.setResizable(false);
        Scene s1=new Scene(root);
        n1.setScene(s1);
        n1.show();
    }
    
    @FXML
    void fileP(ActionEvent event)throws Exception
    {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.getIcons().add(new Image("/img/trident.png"));
        FXMLLoader root=new FXMLLoader();
        root.setLocation(getClass().getResource("FileProper.fxml"));
        Parent root1 =root.load();
        FileProperController c = root.getController();
        c.setP(f1);
        window.setTitle("File Properties");
        window.setResizable(false);
        Scene s1=new Scene(root1);
        window.setScene(s1);
        window.show();
    }
    
    @FXML
    void RaQ(ActionEvent event)throws Exception
    {
        Stage n1=new Stage();
        n1.getIcons().add(new Image("/img/trident.png"));
        n1.initModality(Modality.APPLICATION_MODAL);
        Parent root=FXMLLoader.load(getClass().getResource("QaR.fxml"));
        n1.setTitle("Its for U!");
        n1.setResizable(false);
        Scene s1=new Scene(root);
        n1.setScene(s1);
        n1.show();

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        savemsg = AlertType.INFORMATION;
        alert = new Alert(savemsg,"");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(s);
        alert.getDialogPane().setContentText(" Saved successfully");
        alert.getDialogPane().setHeaderText("");
        fc= new FileChooser();
        fnt=Font.font("Berlin Sans FB",FontWeight.NORMAL,FontPosture.REGULAR,16);
        newM.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
        open.setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
        save.setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
        saveAs.setAccelerator(KeyCombination.keyCombination("Shift+Ctrl+S"));
        close.setAccelerator(KeyCombination.keyCombination("Ctrl+Q"));
        exit.setAccelerator(KeyCombination.keyCombination("Ctrl+F4"));
        cut.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));
        copy.setAccelerator(KeyCombination.keyCombination("Ctrl+C"));
        paste.setAccelerator(KeyCombination.keyCombination("Ctrl+V"));
        undo.setAccelerator(KeyCombination.keyCombination("Ctrl+Z"));
        redo.setAccelerator(KeyCombination.keyCombination("Ctrl+Y"));
        fc.setInitialDirectory(new File("D:\\"));
        textArea.setEditable(false);
        edit.setText("False");
        textArea.textProperty().addListener((observable, oldValue, newValue) ->  
        {
               status.setText("Unsaved...");
               if(f1==null)
                   s.setTitle(Title+"- *untitled");
              else
                   s.setTitle(Title+"-*"+fname);
         });
        save.setDisable(true);
        saveAs.setDisable(true);
        close.setDisable(true);
        cut.setDisable(true);
        copy.setDisable(true);
        paste.setDisable(true);
        undo.setDisable(true);
        redo.setDisable(true);
       
    }
    
}
