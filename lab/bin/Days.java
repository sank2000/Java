import java.util.Scanner;
public class Days 
{
    public static void main(String []args)
    {
     int opt;
     Scanner scan= new Scanner(System.in); 
     System.out.println("\n\t\t MONTHS\n");
     System.out.println("\n1.January\n2.Feburary\n3.March\n4.April\n5.May\n6.June\n7.July\n8.August\n9.September\n10.October\n11.November\n12.December");
     System.out.print("Select your option:");
     opt=scan.nextInt();
     switch(opt)
     {
         case 1:
             System.out.println("The no of days in January is 31 ");
             break;
         case 2:
             System.out.println("The no of days in Feburary is 28 ");
             break;
         case 3:
             System.out.println("The no of days in March is 31 ");
             break;
         case 4:
             System.out.println("The no of days in April is 30 ");
             break;
        case 5:
             System.out.println("The no of days in May is 31 ");
             break;
        case 6:
             System.out.println("The no of days in June is 30 ");
             break;
        case 7:
             System.out.println("The no of days in July is 31 ");
             break;
        case 8:
             System.out.println("The no of days in August is 31 ");
             break;
        case 9:
             System.out.println("The no of days in September is 30 ");
             break;
        case 10:
             System.out.println("The no of days in October is 31 ");
             break;
        case 11:
             System.out.println("The no of days in November is 30 ");
             break;
        case 12:
             System.out.println("The no of days in December is 31 ");
             break;
        default:
             System.out.println("oops Something went wrong!!!!!!!!!");
     }
    }
}
