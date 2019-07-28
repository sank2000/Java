import java.util.Scanner;
class Grade
{
    String name,reg_no;
    String grade[]=new String[5];
    int marks[]=new int[5];
    int total=0;
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
    }
    void calc()
    {
        for(int i=0;i<5;i++)
        {
            if(marks[i]>90)
              grade[i]="O";
            else if(marks[i]>80)
              grade[i]="A+";
            else if(marks[i]>70)
              grade[i]="A";
            else if(marks[i]>60)
              grade[i]="B+";
            else if(marks[i]>50)
              grade[i]="B";
            else
               grade[i]="RA"; 
        }
    }
     void display()
    {
        System.out.print("\nName : "+name);
        System.out.print("\t\tRegister no : "+reg_no);
        System.out.println("\n-------------------------------------------------");
        for(int i=0;i<5;i++)
        {
             System.out.printf("\nSubject %d mark :%d",i+1,marks[i]);
             System.out.print("\t\tGrade  : "+grade[i]);
             System.out.println("");
        }
        System.out.println("\n\t\tTOTAL    : "+total);
    }
   
       
}
public class Gradecalc
{
    
    public static void main(String[] args) 
    {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.print("\nEnter the no. of  Students:");
        num=scan.nextInt();
        Grade obj[] = new Grade[10];
        for(int i=0;i<num;i++)
        {
            obj[i]=new Grade();
            obj[i].getdata();
            obj[i].calc();
        }
        for(int i=0;i<num;i++)
        {
            obj[i].display();
        }
        
        
    }
    
}
