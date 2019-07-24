package convertor;
import java.util.Scanner;
public class Currencyconvertor 
{
    double dollar,rps,euro,yen;
    Scanner scan = new Scanner(System.in);
    public void display()
    {
        while(true)
        {
            int opt;
            System.out.println("\n\t\t     CURRENCY CONVERTOR       \n");
            System.out.println("\n1.Dollar to INR\n2.INR to Dollar\n3.EURO to INR\n4.INR to EURO");
            System.out.println("5.Yen to INR\n6.INR to Yen\n7.Exit");
            System.out.print("Enter your Option:");
            opt=scan.nextInt();
            switch(opt)
            {
                case 1:
                    d_to_i();
                    break;
                case 2:
                    i_to_d();
                    break;
                case 3:
                    e_to_i();
                    break;
                case 4:
                    i_to_e();
                    break;
                case 5:
                    y_to_i();
                    break;
                case 6:
                    i_to_y();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Please enter the correct option...... ");
            }
        }
    
    }
    public void d_to_i()
    { 
        System.out.printf("\n\t\tDollar to INR \n");
        System.out.print("Enter the Dollar:");
        dollar=scan.nextDouble();
        rps = dollar * 68.86;
        System.out.println("\t Rupees :" + rps );
           
   } 
     public void i_to_d()
    { 
        System.out.printf("\n\t\tINR to Dollar \n");
        System.out.print("Enter the INR:");
        rps=scan.nextDouble();
        dollar  = rps * 0.015;
        System.out.println("\t Dollar :" + dollar );
        
           
   } 
      public void e_to_i()
    { 
        System.out.printf("\n\t\tEURO to INR\n");
        System.out.print("Enter the EURO:");
        euro=scan.nextDouble();
        rps = euro * 77.35;
        System.out.println("\t Rupees :" + rps );
           
   } 
       public void i_to_e()
    { 
        System.out.printf("\n\t\tINR to EURO\n");
        System.out.print("Enter the INR:");
        rps=scan.nextDouble();
        euro = rps * 0.013;
        System.out.println("\t EURO :" + euro );
           
   } 
    public void y_to_i()
    { 
        System.out.printf("\n\t\tYen to INR\n");
        System.out.print("Enter the Yen:");
        yen=scan.nextDouble();
        rps = yen * 0.64;
        System.out.println("\t Rupees :" + rps );
           
   } 
    public void i_to_y()
    { 
        System.out.printf("\n\t\tINR to Yen \n");
        System.out.print("Enter the INR:");
        rps=scan.nextDouble();
        yen = rps * 1.57;
        System.out.println("\t Yen :" + yen );
         
   } 
    
    
}
