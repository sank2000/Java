class Data
{
    synchronized void producer()
    {
        for(int i=0;i<10;i++)
        {System.out.println(" producer ");
        if(i==0)
        {
            try
            {
                wait();
            }
            catch(Exception n){}       
        } 
        }
        try
            {
                Thread.sleep(1000);
            }
            catch(Exception n){}       
        } 
    
    synchronized void consumer()
    {
        for(int i=0;i<10;i++)
        System.out.println(" Consumer ");
        notify();
    }
}
public class PC 
{
    public static void main(String[] args) 
    {
        Data obj = new Data();
        new Thread(()->
        {
            obj.producer();
        }
        ).start();
        new Thread(()->
        {
            obj.consumer();
        }
        ).start();
    }
}
