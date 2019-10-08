import java.io.*;
public class FileHandling1 {
    public static void main(String[] args) throws Exception
    {
        String str[]= {"1.txt","2.txt","3.txt"};
        for(int i=0;i<str.length;i++)
        { 
            File f1= new File(str[i]);
            FileInputStream s1 = new FileInputStream(f1);
            new Thread(new Runnable()
            {
               int count=0;
               public void run()
               {
                try{
                 while(s1.read() != -1)
                 {
                   count++;  
                 }
                    System.out.println(f1.getName()+"Count :"+count);
                }
                catch(Exception e){}
               }
            }).start();
        }
    
    }
}
