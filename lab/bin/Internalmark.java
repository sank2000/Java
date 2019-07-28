import java.util.Scanner;
class Mark
{
    int  t_days;
    String name,reg_no;
    Scanner scan=new Scanner(System.in);
    int marks;
    double percent,present;
    Mark(int days)
    {
        t_days=days;
    }
    void getdata()
    {
        System.out.println(" ##################### ");
        System.out.print("\nEnter Student Name:");
        name=scan.next();
        System.out.print("\nEnter Student Register no:");
        reg_no=scan.next();
        System.out.printf("\nEnter No.of days present(out of %d):",t_days);
        present=scan.nextInt();
    }
    void calc()
    {
        percent=present/t_days*100;
        if(percent>=90)
            marks=5;
        else if(percent>=80)
            marks=4;
        else if(percent>=75)
            marks=3;
        else
            marks=0;
            
    }
    void display()
    {
        System.out.println("\n-------------------------------------------------");
        System.out.println("Student Name             : "+name);
        System.out.println("Student Register no      : "+reg_no);
        System.out.println("Total no.of working days : "+t_days);
        System.out.println("No.of days present       : "+present);
        System.out.println("Internal Marks           : " +marks );
    }
    
   
}
public class Internalmark {
    public static void main(String[] args) 
    {
      int num;
      Scanner scan=new Scanner(System.in);
      System.out.print("\nEnter the no. of  Students:");
      num=scan.nextInt();
      Mark obj[] = new Mark[10];
      for(int i=0;i<num;i++)
      {
          obj[i]=new Mark(10);
          obj[i].getdata();
          obj[i].calc();
      }
      
      for(int i=0;i<num;i++)
        {
            obj[i].display();
        }
    }
    
}
