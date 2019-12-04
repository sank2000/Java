
import java.util.Scanner;

class Testmark
{
    String name,reg_no;
    int marks[]=new int[5];
    int total=0,avg;
    Scanner scan=new Scanner(System.in);
    void getdata()
    {
        System.out.println(" ##################### ");
        System.out.print("\nEnter Student Name:");
        name=scan.next();
        System.out.print("\nEnter Student Register no:");
        reg_no=scan.next();
        for(int i=0;i<5;i++)
        {
            System.out.printf("\nEnter mark of subject %d:",i+1);
             marks[i]=scan.nextInt();
             total+=marks[i];
        }
        avg=total/5;
    }
     void display()
    {
        System.out.print("\nName : "+name);
        System.out.print("\t\tRegister no : "+reg_no);
        System.out.println("\n-------------------------------------------------");
        for(int i=0;i<5;i++)
        {
             System.out.printf("\nSubject :%d      mark :%d",i+1,marks[i]); 
             System.out.println("");
        }
        System.out.println("\n\t\tTOTAL    : "+total);
        System.out.println("\n\t\tAverage  : "+avg);
    }
    
    
}
public class Test {
     public static void main(String[] args) 
    {
        int num=5;
        Testmark obj[] = new Testmark[10];
        for(int i=0;i<num;i++)
        {
            obj[i]=new Testmark();
            obj[i].getdata();
        }
        for(int i=0;i<num;i++)
        {
            obj[i].display();
        }
 
    
    }
    
}
