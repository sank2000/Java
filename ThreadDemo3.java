class Count
{
    int count=0;
    synchronized void increment()
    {
        count++;
    }
}
public class ThreadDemo3 
{
    public static void main(String[] args)throws Exception
    {
        Count c=new Count();
        Thread t1=new Thread(new Runnable()
        {
           public void run()
            {
                for(int i=0;i<10000;i++)
                c.increment();
            }
     
        });
        Thread t2=new Thread(new Runnable()
        {
           public void run()
            {
                for(int i=0;i<10000;i++)
                c.increment();
            }
     
        });
        t1.start();
        t2.start();
        System.out.println("Alive : " + t1.isAlive());
        System.out.println("Alive : " + t1.getPriority());
        t1.setPriority(10);
        System.out.println("Alive : " + t1.getPriority());
        t1.join();
        t2.join();
        System.out.println("Alive : " + t1.isAlive());
        System.out.println("count = " + c.count);
   
    }
}
