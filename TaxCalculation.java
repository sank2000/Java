
import java.util.Scanner;

interface customer
{
    void information();
    void show();
    double rate1 =0.1;
    double rate2 =0.2;
    double rate3 =0.25;
                    
}
class Employee  implements customer
{
    Scanner scan = new Scanner(System.in);
    String name,id;
    char sex;
    double sal,bp,tax;
    public void information()
    {
        System.out.print("Enter name          : ");
        name = scan.next();
        System.out.print("Enter  id           : ");
        id = scan.next();
        System.out.print("Enter  sex (m/f)    : ");
        sex = scan.next().charAt(0);
        System.out.print("Enter the basic pay : ");
        bp = scan.nextDouble();
        if(bp > 500000)
        {
            if(sex=='m')
            {
              sal = bp-(bp * rate3);
              tax = rate3;
            }
            else
            {
                sal =bp-(bp * rate2);
                tax = rate2;
            }
        }
        else if(bp >= 300000)
        {
            if(sex=='m')
            {
              sal = bp-(bp * rate2);
              tax = rate2;
            }
            else
            {
                sal =bp-( bp * rate1);
                tax = rate1;
            }
        }
        else if(bp >= 200000)
        {
            if(sex=='m')
            {
              sal = bp-(bp * rate1);
              tax = rate1;
            }
        }
        else
        {
            sal = bp;
        }
    }
    
    public void show()
    {
         System.out.println();
         System.out.println("-----------------------------------------");
         System.out.println("NAME        : " + name);
         System.out.println("ID          : " + id);
         System.out.println("SEX         : " + sex);
         System.out.println("Basic pay   : " + bp);
         System.out.println("TAX         : " + tax);
         System.out.println("SALARY      : Rs.2 " + sal);
    }
}
public class TaxCalculation
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        Employee[] obj = new Employee[10];
        System.out.print("Enter the no. of employee : ");
        num = scan.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.println("-----------------------------------------");
            obj[i] = new Employee();
            obj[i].information();
        }
        for(int i=0;i<num;i++)
        {
             obj[i].show();
        }
    }
}