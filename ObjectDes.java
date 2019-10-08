import java.io.*;
public class ObjectDes
{
    public static void main(String[] args) throws Exception
    {
    San obj1,obj2,obj3;
    File f=new File("e:\\1\\3.txt");
    FileInputStream f1=new FileInputStream(f);
    ObjectInputStream os1=new ObjectInputStream(f1);
    System.out.println(os1.read());
    obj1=(San)os1.readObject();
    System.out.println(os1.available());
    obj2=(San)os1.readObject();
    System.out.println(os1.available());
    obj3=(San)os1.readObject();
    System.out.println( obj1.Sub);
    System.out.println( obj2.Sub);
    System.out.println( obj3.Sub);
    
    
}
}
 