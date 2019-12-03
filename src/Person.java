import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class Person 
{
    StringProperty str=new SimpleStringProperty(this,"name","");

    public StringProperty strProperty() {
        return str;
    }

    public void setStr(String str) {
        this.str.set(str);
    }
    public String getStr()
    {
        return str.get();
    }
     
}
