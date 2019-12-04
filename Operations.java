import java.util.Scanner;
class Listoperations<S extends Comparable<S>>
{
    S arr[];
    int no;
    Scanner scan = new Scanner(System.in);
    Listoperations(S lst[])
    {        
      arr=lst;
      no =0;
    }
    void in_begin(S num)
    {
        if(no < arr.length )
        {
            for(int i=no;i>0;i--)
                arr[i]=arr[i-1];
            arr[0]=num;
            no++;
            System.out.println("\tInsertion done");
        }
        else
            System.out.println("\tInsertion Not possible");
    }
    void in_end(S num)
    {
        if(no < arr.length )
        {
            arr[no++]=num;
            System.out.println("\tInsertion done");
        }
        else
            System.out.println("\tInsertion Not possible");
    }
    void insert(S num)
    {
        if(no < arr.length)
        {
            System.out.print("\nEnmter your Position between 1 to "+(no+1)+" : ");
            int pos = scan.nextInt();
            for(int i=no;i>pos-1;i--)
                arr[i]=arr[i-1];
            arr[pos-1]=num;
            no++;
            System.out.println("\tInsertion done");
        }
        else
            System.out.println("\tInsertion Not possible");
    }
    void del(S num)
    {
        int found=0,index=0;
        for(int i=0;i<no;i++)
        {
            if(num.compareTo(arr[i])==0)
            {
                found=1;
                index = i;
                break;
            }
        }
        if(found==0)
        {
            System.out.println("\tElement not found");
            return;
        }
        if(index == arr.length-1)
        {
            no--;
            System.out.println("\tDeleted Successfully");
            return;
        }
        for(int i=index;i<no;i++)
            arr[i]=arr[i+1];
        no--;
        System.out.println("\tDeleted Successfully");
    }
    void display()
    {
        for(int i=0;i<no;i++)
            System.out.println("\t"+arr[i]);
    }
}
public class Operations 
{
    public static void main(String[] args) 
    {
        Integer arr[]={0,0,0,0,0};
        Scanner scan = new Scanner(System.in);
        Listoperations<Integer> obj = new Listoperations<Integer>(arr);
        int opt,num;
        while(true){
        System.out.print("\t\n1.Insert Begining\n2.Insert End\n3.Insert\n4.Delete\n5.Display\n6.Exit\nEnter your option:");
        opt=scan.nextInt();
        switch(opt)
        {
            case 1:
                  System.out.print("Enter the number : ");
                  num = scan.nextInt();
                  obj.in_begin(num);
                  break;
            case 2:
                  System.out.print("Enter the number : ");
                  num = scan.nextInt();
                  obj.in_end(num);
                  break;
            case 3:
                  System.out.print("Enter the number : ");
                  num = scan.nextInt();
                  obj.insert(num);
                  break;
            case 4:
                  System.out.print("Enter the number : ");
                  num = scan.nextInt();
                  obj.del(num);
                  break;
            case 5:obj.display();
                  break;
            case 6:System.exit(0);
        }
        }
    }
}
