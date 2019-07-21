import convertor.Currencyconvertor;
import convertor.Distanceconvertor;
import convertor.Timeconvertor;
import java.util.Scanner;
public class Convertor
{
    public static void main(String[] args) 
    {
        int opt;
        Currencyconvertor cobj = new Currencyconvertor();
        Distanceconvertor dobj = new Distanceconvertor();
        Timeconvertor tobj = new Timeconvertor();
        Scanner scan=new Scanner(System.in);
        while(true)
        {
            System.out.println("\n\n\t___________ Welcome to the Convertor World____________");
            System.out.println("1.TIME CONVERTOR\n2.CURRENCY CONVERTOR\n3.DISTANCE CONVERTOR\n4.Exit");
            System.out.print("\nEnter your option:");
            opt=scan.nextInt();
            switch(opt)
            {
                case 1:
                    tobj.display();
                    break;
                case 2:
                    cobj.display();
                    break;
                case 3:
                    dobj.display();
                    break;
                case 4:
                    System.out.println("\t\t Thank You...... \n\t\tRate us\n\t\t Visit Again ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\tPlease enter your correct option " );
            }
        }
        
    }
    
}
