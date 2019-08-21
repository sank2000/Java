class Thrd1 implements Runnable
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
class Thrd2 implements Runnable
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
public class ThreadDemo2 
{
    public static void main(String[] args)
    {
        Thrd1 obj1=new Thrd1();
        Thrd2 obj2=new Thrd2();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        
        System.out.println("Name bef change 1 :" + t1.getName());
        System.out.println("Name bef change 2 :" + t2.getName());
        t1.setName("thrd 1");
        t2.setName("thrd 2");
        System.out.println("Name aftr change 1 :" + t1.getName());
        System.out.println("Name aftr change 2 :" + t2.getName());
        t1.start();
        t2.start();
         
    }
    
}
