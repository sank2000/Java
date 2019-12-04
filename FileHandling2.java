import java.io.*;
public class FileHandling2 {
    public static void main(String[] args) throws Exception 
    {
        File f1 = new File("e:\\1.txt");
        FileOutputStream f = new FileOutputStream(f1);
        DataOutputStream sb = new DataOutputStream(f);
       // BufferedInputStream sb = new BufferedInputStream(f);
       for(int i=0;i<100;i++) 
        sb.writeUTF("str"+i);
       sb.flush();
        f.close();
    }
}
