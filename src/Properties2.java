
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Properties2 
{
    public static void main(String[] args) 
    {
        IntegerProperty num1=new SimpleIntegerProperty(3);
        IntegerProperty num2=new SimpleIntegerProperty();
        
        num2.bind(num1.multiply(10));
        System.out.println(" num1 :"+num1.getValue());
        System.out.println(" num2 : " + num2.getValue()+"\n");
        
        num1.setValue(10);
        System.out.println(" num1 :"+num1.getValue());
        System.out.println(" num2 : " + num2.getValue()+"\n");
    }
}
