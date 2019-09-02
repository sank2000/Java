public class VoteCount 
{
    public static void main(String[] args) 
    {
    char arr[] ={'a','a','a','c','c','b','b','c','c','c','b','c','c'};
    int value = 1;
    char max = arr[0];
    for(int i=1 ;i < arr.length ;i++)
    {
        if(max == arr[i])
        {
            value++;
        }
        else
        {
            value--;
            if(value==0)
            {
                max = arr[++i];
                value = 1;
            }
        }
        
    }
    System.out.println("Winner   = " + max);
    System.out.println("Votes    = " + value);
   }
}
