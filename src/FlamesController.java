import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
public class FlamesController 
{
    @FXML
    TextField f1;
    @FXML
    TextField f2;
    @FXML
    TextField f3;
    public void handleButtonAction(ActionEvent event)
    {
        String str1,str2,str="flames";
        int count=0,len1,len2,f_count,temp;
        str1=f1.getText();
        str2=f2.getText();
        str1=str1.replace(" ","").toLowerCase();
        str2=str2.replace(" ","").toLowerCase();
        len1=str1.length();
        len2=str2.length();
        int arr[]=new int[len2];
        for(int i=0;i<len1;i++)
            for(int j=0;j<len2;j++)
            {
                if(str1.charAt(i)==str2.charAt(j) && arr[j]==0)
                {
                    count++;
                    arr[j]=1;
                    break;
                }
            }
        f_count=(len1-count)+(len2-count);
        if(f_count==0)
            System.out.println("Oops Same name");
        else
        {
            while(str.length()!=1)
            {
                temp = (f_count % str.length())-1;
                if(temp==-1)
                    str=str.substring(0,str.length()-1);                   
                else
                {
                    String temp1,temp2;
                    temp1=str.substring(0,temp);
                    temp2=str.substring(temp+1);
                    str=temp2+temp1;
                }
            }
        }
        switch(str.charAt(0))
        {
            case 'f':
                f3.setText("Friends");
                break;
            case 'l':
                f3.setText("Lover");
                break;
            case 'a':
                f3.setText("Affection");
                break;
            case 'm':
                f3.setText("Marriage");
                break;
            case 'e':
                f3.setText("Enimes");
                break;
            case 's':
                f3.setText("Siblings");
                break;
        }
    }
}
