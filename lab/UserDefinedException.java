import java.util.Scanner;
class Negativemark extends Exception
{
	public String toString()
	{
		return "The Entered Mark is Negative";
	}
}
class Student
{
    String name,reg_no;
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
            try
            {
              marks[i]=scan.nextInt();
              if(marks[i]<0)
            	  throw new Negativemark();
            }
            catch(Negativemark e)
            {
            	System.out.println(e);
            	System.out.println("\nPlease Enter the Mark in Positive!!!");
            	System.out.printf("\nEnter mark of subject %d:",i+1);
            	 marks[i]=scan.nextInt();
            }
             total+=marks[i];
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
             System.out.println("");
        }
        System.out.println("\n\t\tTOTAL    : "+total);
    }
}
public class UserDefinedException {

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
