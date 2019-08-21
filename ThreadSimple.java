public class ThreadSimple 
{
    public static void main(String[] args)
    {
        Thread t1=new Thread(() ->
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
            
        });
        Thread t2=new Thread(()->
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

        });
        t1.start();
        t2.start();
         
    }
    
}
