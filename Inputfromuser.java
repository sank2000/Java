import java.util.Scanner;
public class Inputfromuser
{
 public static void main(String []args)
 {
  int a;
  int b;
  int c;
  Scanner kb=new Scanner(System.in);
  System.out.print("Enter Value for a and b:");
  a = kb.nextInt();
  b= kb.nextInt();
  c=a+b;
  System.out.println("The sum of"+a+"and"+b+"is"+c);
}
}  