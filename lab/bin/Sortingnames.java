
import java.util.Scanner;

public class Sortingnames {

    public static void main(String[] args)
    {
        int num;
        Scanner s = new Scanner(System.in);
        String data[]=new String[10];
        System.out.print("\nEnter the no. of  names:");
        num=s.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.printf("\nEnter the %d name :",i+1);
            data[i]=s.next();
        }
        for(int i=0;i<num;i++)
            for(int j=i;j<num;j++)
            { 
                int check=data[i].compareTo(data[j]);
                
                if(check>0)
                {
                   String temp;
                   temp = data[i];
                   data[i]=data[j];
                   data[j]=temp;
                }
            }
        for(int i=0;i<num;i++)
            System.out.println(data[i]);
    }
    
}
