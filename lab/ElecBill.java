package lab;
import java.util.Scanner;
class Bill{
    int custid,type;
    double preread,curread,read;
    double rs;
    String custname;
    void getdata(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the customer id:");
        custid=scan.nextInt();
        System.out.print("Enter customer name:");
        custname=scan.next();
        System.out.print("Enter the previous month reading:");
        preread=scan.nextDouble();
        System.out.print("Enter the current month reading:");
        curread=scan.nextDouble();
    }
    void calc(){
    	if(preread>curread)
    		return;
     read=curread-preread;
     if(type==0)
     {
         if(read<=100)
             rs=1*read;
         else if(read<=200)
             rs=2.50*read;
         else if(read<=500)
             rs=4*read;
         else
             rs=6*read;
         
     }
     else
     {
         if(read<=100)
             rs=2*read;
         else if(read<=200)
             rs=4.50*read;
         else if(read<=500)
             rs=6*read;
         else
             rs=8*read;  
     }
     
     }
    void display(){
        System.out.println("\n\n\n---------ELECTRICITY BILL--------\n" );
         System.out.println("Customer id        :"+custid);
         System.out.println("\nCustomer name      :"+custname);
         if(type==0)
        	 System.out.println("\nCustomer type      :Domestic");
         else
        	 System.out.println("\nCustomer type      :Commercial");
         System.out.println("\nPrevious Reading   :"+preread);
         System.out.println("\nCurrent Reading    :"+curread);
         System.out.println("\nUnits Consumed     :"+read);
         System.out.printf("\nAmount             :Rs.%.2f",rs);    
    } 
}
public class ElecBill
{
    public static void main(String[] args)
	{
        int num,i;
        Scanner scan=new Scanner(System.in);
        Bill obj[]=new Bill[10];
        System.out.println("--------ELECTRICITY BILL CALCULATOR-------\n");
        System.out.print("Enter the number of customers: ");
        num=scan.nextInt();
        for(i=0;i<num;i++)
        {
            obj[i]=new Bill();
            boolean j = false;
            do
            {
            	if(j)
            		System.out.printf("\nYou are allowed only to enter 0 or 1 !\n");
            		
            System.out.printf("\t\tTYPE\n\t0.Domestic\n\t1.Commercial ");
            System.out.printf("\nSelect your type(0/1):");
            obj[i].type=scan.nextInt();
            j=true;
            }while(obj[i].type != 0 && obj[i].type != 1);
            obj[i].getdata();
            obj[i].calc();
        }
        for(i=0;i<num;i++)
        {
            obj[i].display();
        }
	}
}
