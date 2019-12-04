import YEAR_1.YearImarks;
import YEAR_2.YearIImarks;
import java.util.Scanner;
class Student 
{ 
    String name,reg_no;
    String grade[]=new String[5];
    YearImarks obj1=new YearImarks();
    YearIImarks obj2=new YearIImarks();
    Scanner scan=new Scanner(System.in);
    void getdata()
    {
        for(int i=0;i<4;i++)
            grade[i]="PASS";
        System.out.println(" ##################### ");
        System.out.print("\nEnter Student Name:");
        name=scan.next();
        System.out.print("\nEnter Student Register no:");
        reg_no=scan.next();
        System.out.print("\nEnter mark of subject 1 of year 1:");
        obj1.mark1=scan.nextInt();
        if(obj1.mark1<50)
            grade[0]="FAIL";
        System.out.print("\nEnter mark of subject 2 of year 1:");
        obj1.mark2=scan.nextInt();
        if(obj1.mark2<50)
            grade[1]="FAIL";
        System.out.print("\nEnter mark of subject 1 of year 2:");
        obj2.mark3=scan.nextInt();
        if(obj2.mark3<50)
            grade[2]="FAIL";
        System.out.print("\nEnter mark of subject 2 of year 2:");
        obj2.mark4=scan.nextInt();
        if(obj2.mark4<50)
            grade[3]="FAIL";
    }
     void display()
    {
        System.out.print("\nName : "+name);
        System.out.print("\t\tRegister no : "+reg_no);
        System.out.println("\n-------------------------------------------------");
        System.out.printf("\nYEAR 1 mark 1:%d",obj1.mark1);
        System.out.print("\t\tGrade  : "+grade[0]);
        System.out.printf("\nYEAR 1 mark 2:%d",obj1.mark2);
        System.out.print("\t\tGrade  : "+grade[1]);
        System.out.printf("\nYEAR 2 mark 1:%d",obj2.mark3);
        System.out.print("\t\tGrade  : "+grade[2]);
        System.out.printf("\nYEAR 2 mark 2:%d",obj2.mark4);
        System.out.print("\t\tGrade  : "+grade[3]);
        System.out.println("");
    }
}
public class Studentmark 
{
    public static void main(String[] args) 
    {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.print("\nEnter the no. of  Students:");
        num=scan.nextInt();
        Student obj[] = new Student[10];
        for(int i=0;i<num;i++)
        {
            obj[i]=new Student();
            obj[i].getdata();
        }
        for(int i=0;i<num;i++)
        {
            obj[i].display();
        }
    
}
}
