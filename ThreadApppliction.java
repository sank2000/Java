import java.util.*;
class RandomThread
{
    Random obj = new Random();
    int num,no;
    boolean check;
    synchronized void random()
    {
        for(int i=0;i<no;i++)
        {
         System.out.println("\n\n");
         num=obj.nextInt(100);
         System.out.println("num = " + num);
         if((num % 2) == 0)
             check = true;
         else
             check = false;
         if(i != 0)
            notifyAll();
        if(i != no-1)
        {
        try
            {
               wait(1000);
            }
            catch(Exception n){}       
        }
        }
    }
    synchronized void odd()
     {
        for(int i=0;i<no;i++)
        {
            if(!check)
            {
               System.out.println("The number is Odd" );
               System.out.println("Cube of the number :" +(num*num*num) );
               notify();
            }
            if(i != no-1)
            { try
            {
               wait();
            }
            catch(Exception n){}}
        }
     }
       
    synchronized void even()
    {
        for(int i=0;i<no;i++)
        {
            if(check)
            {
               System.out.println("The number is Even" );
               System.out.println("Square of the number :" +(num*num) );
               notify();
            }
            if(i != no-1){
            try
            {
               wait();
            }
            catch(Exception n){}}
        }
    }
}
public class ThreadApppliction 
{
    public static void main(String[] args) throws Exception
    {
        RandomThread obj = new RandomThread();
        Thread t1 = new Thread(()->
        {
           obj.random();
        });
        Thread t2 = new Thread(()->
        {
           obj.odd();
        });
        Thread t3 = new Thread(()->
        {
           obj.even();
        });
        obj.no=5;
        t1.start();
        t2.start();
        t3.start();
    }
       
}
