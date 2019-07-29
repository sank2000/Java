
import java.util.*;

public class StringToken {

    public static void main(String[] args) 
    {
        String data;
        int total=0;
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter your numbers:");
        data=s.nextLine();
        StringTokenizer str=new StringTokenizer(data);
        while(str.hasMoreTokens())
            total+=Integer.parseInt(str.nextToken());
        System.out.println("\nTotal of the numbers  : " +total);
        
    }
    
}
