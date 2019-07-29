
import java.util.Scanner;

public class Paliindrome 
{

    public static void main(String[] args) 
    {
         Scanner s = new Scanner(System.in);
         String data,reverse="";
         System.out.print("\nEnter your String:");
         data=s.nextLine();
//          StringBuilder sb=new StringBuilder(data);
//          sb.reverse();
//          reverse=sb.toString();
         for(int i=data.length()-1;i>=0;i--)
                reverse=reverse+data.charAt(i);
          
         if(data.equals(reverse))
               System.out.println("\n\n The Given string is Palindrome");
         else
             System.out.println("\n\nIt is not palinfrome");
    
    }
}
