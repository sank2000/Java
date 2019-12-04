
import java.util.Scanner;
class WrongPin extends Exception
{
    public String toString() 
    {
        return "Pin doesn't match";
    }
    
}
class CardnumException extends Exception
{
    public String toString() 
    {
        return "Card Number is not Valid";
    }
    
}
class MiniBalance extends Exception
{
    public String toString() 
    {
        return "Withdrawal Denied(Less Balance)";
    }
    
}
class Bank1
{
    String card;
    int pin,balance;
    Bank1(String num,int pin,int bal )
    {
        this.pin = pin;
        balance = bal;
        card  =  num;
    }
    void credit()
    {
        Scanner scan = new Scanner(System.in);
        String num;
        int pn,amt;
        System.out.print("Enter your Card num    : ");
        num = scan.next();
        if(!(num.equals(card)))
        {
            try
            {
                throw new CardnumException();
            }
            catch(Exception e)
            {
                System.out.println(e);
                return;
            }
        }
        System.out.print("Enter your Pin       : ");
        pn = scan.nextInt();
        if(pn != pin)
        {
            try
            {
                throw new WrongPin();
            }
            catch(Exception e)
            {
                System.out.println(e);
                return;
            }
        }
        System.out.print("Enter the amount to Credit : ");
        amt = scan.nextInt();
        balance+=amt;
        System.out.println("Credited Successfully .....");
    }
        
    
}
public class CreditTransaction 
{
    public static void main(String[] args) 
    {
        Bank1 obj = new Bank1("98765",123,1000);
        obj.credit();
    
    }
    
}
