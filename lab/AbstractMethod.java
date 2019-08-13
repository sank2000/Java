import java.util.Scanner;
abstract class Shape
{
	int data1,data2;
	abstract void printarea();
	Scanner scan=new Scanner(System.in);
}
class Rectangle extends Shape
{
	void printarea()
	{
		int area;
		System.out.println("\n\t\tRECTANGLE\n");
		System.out.print("Enter the Breadth :");
		data1=scan.nextInt();
		System.out.print("Enter the Length :");
		data2=scan.nextInt();
		area=data1*data2;
		System.out.println("Area of Rectangle  :"+area);
	}
	
}
class Triangle extends Shape
{
	void printarea()
	{
		double area;
		System.out.println("\n\t\tTRIANGLE\n");
		System.out.print("Enter the Base :");
		data1=scan.nextInt();
		System.out.print("Enter the Height :");
		data2=scan.nextInt();
		area=0.5*(data1*data2);
		System.out.println("Area of Triangle  :"+area);
	}
}
class Circle extends Shape
{
    void printarea()
	{
    	double area;
    	System.out.println("\n\t\tCIRCLE\n");
    	System.out.print("Enter the Radius :");
		data1=scan.nextInt();
		area=3.14*(data1*data1);
		System.out.println("Area of Circle  :"+area);
	}
	
}
public class AbstractMethod 
{
	public static void main(String args[]) 
	{
		   Rectangle robj=new Rectangle();
		   Triangle tobj=new Triangle();
		   Circle cobj=new Circle();
		   Scanner scan=new Scanner(System.in);
		   Shape ref;
		   int opt;
			while(true)
		   {
		       System.out.println("\n$$$$$$$$$$           AREA CALCULATOR         $$$$$$$$$$$$$  \n");
		       System.out.println("\n1.Rectangle\n2.Triangle\n3.Circle\n4.EXIT");
		       System.out.print("Select Your  Option:");
		       opt=scan.nextInt();
		       switch(opt)
		       {
		       case 1:
		    	   ref=robj;
		           ref.printarea();
		           break;
		       case 2:
		    	   ref=tobj;
		           ref.printarea();
		           break;
		       case 3:
		    	   ref=cobj;
		           ref.printarea();
		           break;
		       case 4:
		               System.exit(0);break;
		       default:
		           System.out.println("\nplease select correct option ");
		   }
		   
	     }
}
}
  
