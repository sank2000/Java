import java.util.Scanner;
class Bank2
{
    String card;
    int pin,balance;
    Bank2(String num,int pin,int bal )
    {
        this.pin = pin;
        balance = bal;
        card  =  num;
    }
    void debit()
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
        System.out.print("Enter the amount to Debit : ");
        amt = scan.nextInt();
        if(amt > balance)
        {
            try
            {
                throw new MiniBalance(); 
            }
            catch(Exception e)
            {
                System.out.println(e);
                return;
            }
        }
        balance-=amt;
        System.out.println("Collect Your Cash!!!" );
        
     }
}
public class Debit 
{
    public static void main(String[] args) 
    {
        Bank2 obj = new Bank2("98765",123,1000);
        obj.debit();
    }
}
