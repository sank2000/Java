package convertor;
import java.util.Scanner;
public class Timeconvertor 
{
    double hrs,min,sec;
    Scanner scan = new Scanner(System.in);
    public void display()
    {
        while(true)
        {
            int opt;
            System.out.println("\n\t\t     TIME CONVERTOR       \n");
            System.out.println("\n1.Hours to Minutes\n2.Minutes to Hours\n3.Hours to Second\n4.Second to Hours\n5.Exit");
            System.out.print("Enter your Option:");
            opt=scan.nextInt();
            switch(opt)
            {
                case 1:
                    hrs_to_min();
                    break;
                case 2:
                    min_to_hrs();
                    break;
                case 3:
                    hrs_to_sec();;
                    break;
                case 4:
                    sec_to_hrs();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Please enter the correct option...... ");
            }
        }
    }
    public void hrs_to_min()
    { 
        System.out.printf("\n\t\tHours to Minutes\n");
        System.out.print("Enter the Hours  :");
        hrs=scan.nextInt();
        System.out.print("Enter the Minutes:");
        min=scan.nextInt();
        System.out.print("Enter the Seconds:");
        sec=scan.nextInt();
        min=(hrs*60)+min;
        while(sec>60)
        {
            min++;
            sec = sec -60;
        }
        System.out.printf("\n\t\tMinutes : Seconds  = %.0f : %.0f",min,sec);
    }
    public void min_to_hrs()
    { 
        System.out.printf("\n\t\tMinutes to Hours\n");
        System.out.print("Enter the Minutes:");
        min=scan.nextInt();
        System.out.print("Enter the Seconds:");
        sec=scan.nextInt();
        while(sec>60)
        {
            min++;
            sec = sec -60;
        }
        hrs=min/60;
        min=min%60;
        System.out.printf("\tHours : Minute : Seconds  =  %.0f : %.0f :%.0f",hrs,min,sec);
            
    } 
    public void hrs_to_sec()
    { 
        System.out.printf("\n\t\tHours to Seconds\n");
        System.out.print("Enter the Hours : ");
        hrs = scan.nextDouble();
        sec=hrs*60*60;
        System.out.println("\n\t Seconds  : "+sec );
           
   } 
    public void sec_to_hrs()
    { 
        System.out.printf("\n\t\tSeconds to Hours\n ");
        System.out.print("Enter the seconds : ");
        sec = scan.nextDouble();
        hrs=sec/3600;
        System.out.println("\n\t Hours   : "+hrs );
            
    }
}
    

