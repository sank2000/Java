import java.util.Scanner;
class Method
{
    int max,count;
    <L extends Comparable<L>>void list(L arr[])
    {
        Scanner scan = new Scanner(System.in);
        L maxi = arr[0];
        int pos1,pos2,len=arr.length;
        for(int i=0;i<len;i++)
        {
            int num =(Integer)arr[i];
            if(num % 2 != 0)
                count++;
            if(arr[i].compareTo(maxi) > 0)
            {
                maxi =arr [i];
            }
            max=(Integer)maxi;
        }
        for(L i : arr)
            System.out.print("\t" + i);
        System.out.println("\nSelect two Position between 1 to "+len);
        System.out.print("Enter the position 1 :");
        pos1 = scan.nextInt();
        System.out.print("Enter the position 2 :");
        pos2 = scan.nextInt();
        if(pos1 > len|| pos2 > len)
        {
            System.out.println("Exchange not possible!!!!");
            return;
        }
        else
        {
            L temp=arr[pos1-1];
            arr[pos1-1] = arr[pos2-1];
            arr[pos2-1] = temp;
        }
        System.out.println("After Exchange.........");
        for(L i : arr)
            System.out.print("\t" + i);
    }
}
public class GenericMethod 
{
    public static void main(String[] args) 
    {
        Integer[] lst = {13,34,19,56,76,34,70,17,52};
        Method obj = new Method();
        obj.list(lst);
        System.out.println("\n\n\nTotal number of ODD numbers  : "+obj.count );
        System.out.println("Maximum element in the list  : "+obj.max);
    }
}
