import java.util.*;
class Odd extends Thread
{
    int num;
    Odd(int no)
    {
        num = no;
    }
    public void run()
    {
        System.out.println("The number is Odd" );
        System.out.println("Cube of the number :" +(num*num*num) );
    }
}
class Even extends Thread
{
    int num;
    Even(int no)
    {
        num = no;
    }
    public void run()
    {
        System.out.println("The number is Even" );
        System.out.println("Square of the number :" +(num*num) );
    }
}
class RandomThread extends Thread
{
    Random obj = new Random();
    int num,no;
    public void run()
    {
        for(int i=0;i<no;i++)
        {
         System.out.println("\n\n");
         num=obj.nextInt(100);
         System.out.println("num = " + num);
         if((num % 2) == 0)
         {
             Even obj = new Even(num);
             obj.start();
         }
         else
         {
             Odd obj = new Odd(num);
             obj.start();
         }
        try
            {
               Thread.sleep(1000);
            }
            catch(Exception n){}    
        }
        }
    }

public class ThreadApplication 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        RandomThread t1 = new RandomThread();
        System.out.print("Enter the no. of times : ");
        t1.no=scan.nextInt();
        t1.start();
    } 
}