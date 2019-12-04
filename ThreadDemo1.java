class Thread1 extends Thread
{
    public void run()
    {
        System.out.println(" Inside thread 1 ");
        for(int i=0;i<10;i++)
        {
            try
            {
            Thread.sleep(100);
            }
            catch(Exception e){}
            System.out.println("HI "+(i+1));
    }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        System.out.println(" Inside thread 2 ");
         for(int i=0;i<10;i++)
        {
            try
            {
            Thread.sleep(100);
            }
            catch(Exception e){}
            System.out.println("Hello "+(i+1));
        }

    }
}
public class ThreadDemo1 
{
    public static void main(String[] args)
    {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
         
    }
    
}
