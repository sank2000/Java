import java.util.Scanner;
interface StackMethod
{
	int max=10;
	void create();
	void push();
	void pop();
	void display();
}
class StackDefine implements StackMethod
{
	int top;
	int arr[]=new int[max];
	StackDefine()
	{
		top=-1;
	}
	public void create()
	{
		int num,no;
		System.out.println("\t\t Stack Creation");
		System.out.print("Enter the no. of elements:");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		if(num <= max)
		{
		    for(int i=1;i<=num;i++)
		    {
		    	System.out.printf("Enter the element %d:",i);
		    	no=scan.nextInt();
		    	top=top+1;
		    	arr[top]=no;
		    	
		    }
		}
		else
			System.out.println("\nEnter the correct size!!!!!");
		
	}
	public void push()
	{
		int num;
	        try
		{
			System.out.print("\nEnter the element that you want to push:");
			Scanner scan=new Scanner(System.in);
			num=scan.nextInt();
			top=top+1;
			arr[top]=num;
		}
                catch(IndexOutOfBoundsException e)
                {
                     top=top-1; 
                     System.out.println("\nStack overflow");
                }
	}
	public void pop() 
	{
		try
		{
			System.out.println("The poped element is:"+arr[top]);
			top--;
		}
                catch(IndexOutOfBoundsException e)
                {
                    System.out.println("\nStack Underflow");
                }
	}
	public void display()
	{
		if(top<0)
		{
			System.out.println("Stack is Empty!!");
			return;
		}
		else
		{
			System.out.println("The elements in the stack");
			 for(int i=top;i>=0;i--)
		         System.out.println(arr[i]);
		}
	}
	
}
public class StackException extends StackDefine 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
	    StackMethod obj=new StackDefine();
		int opt;
		while(true)
        {
            System.out.println("\n$$$$$$$$$$           STACK         $$$$$$$$$$$$$  \n");
            System.out.println("\n1.CREATE\n2.PUSH\n3.POP\n4.DISPLAY\n5.EXIT");
            System.out.print("Select Your  Option:");
            opt=scan.nextInt();
            switch(opt)
            {
            case 1:
                    obj.create();
                    break;
            case 2:
            	   obj.push();
                    break;
            case 3:
                    obj.pop();
                    break;
            case 4:
	                obj.display();
	                break;
             case 5:
                   System.exit(0);break;
            default:
                System.out.println("\nplease select correct option ");
        }
	}
}
}