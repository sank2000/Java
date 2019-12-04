import java.io.*;
public class ObjectSer
{
    public static void main(String[] args)throws Exception
    {
        San obj1=new San(10,"san");
        San obj2 = new San(20,"vel");
        San obj3= new San(30,"reg");
        File f=new File("e:\\1\\3.txt");
        FileOutputStream f1=new FileOutputStream(f);
        ObjectOutputStream os1=new ObjectOutputStream(f1);
        os1.writeObject(obj1);
        os1.writeObject(obj2);
        os1.writeObject(obj3);
        
        
    }
    
}
class San implements Serializable
{
    int val;
    String Sub;

    San(int val, String Sub) {
        this.val = val;
        this.Sub = Sub;
    }
}
