package convertor;
import java.util.Scanner;
public class Distanceconvertor 
{
    double meter,km,miles;
    Scanner scan = new Scanner(System.in);
    public void display()
    {
        while(true)
        {
            int opt;
            System.out.println("\n\t\t      DISTANCE  CONVERTOR       \n");
            System.out.println("\n1.Meter to Kilometer\n2.Kilometer to Meter\n3.Miles to Kilometer\n4.Kilometer to Mies\n5.Exit");
            System.out.print("Enter your Option:");
            opt=scan.nextInt();
            switch(opt)
            {
                case 1:
                    met_to_km();
                    break;
                case 2:
                    km_to_met();
                    break;
                case 3:
                    ml_to_km();
                    break;
                case 4:
                    km_to_ml();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Please enter the correct option...... ");
            }
        }
    }
    public void met_to_km()
    { 
        System.out.printf("\n\t\tMeter to Kilometer \n");
        System.out.print("Enter the meter:");
        meter=scan.nextDouble();
        km=meter/1000;
        System.out.println("\tKilometers : "+ km);       
    }
    public void km_to_met()
    { 
        System.out.printf("\n\t\tKilometer to Meter\n");
        System.out.print("Enter the Kilometer:");
        km=scan.nextDouble();
        meter = km*1000;
        System.out.println("\tMeter      : "+meter );   
    } 
    public void ml_to_km()
    { 
        System.out.printf("\n\t\tMiles to Kilometer\n");
        System.out.print("Enter the Miles:");
        miles=scan.nextDouble();
        km = miles * 1.609;
        System.out.println("\tKilometers : "+km);
    } 
    public void km_to_ml()
    { 
        System.out.printf("\n\t\tKilometer to Miles \n");
        System.out.print("Enter the Kilometer:");
        km=scan.nextDouble();
        miles = km / 1.609;
        System.out.println("\tMiles   : " +miles );
            
    }
}
    

