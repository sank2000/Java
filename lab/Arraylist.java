import java.util.*;
class Method
{
    ArrayList<String> arr = new ArrayList<String>();
    Scanner scan=new Scanner(System.in);
    String str;
    void append()
    {
        int no;
        System.out.print("Enter the number of element:");
        no=scan.nextInt();
        for(int i=1;i<=no;i++)
        {
            System.out.printf("Enter the string %d:",i);
            str=scan.next();
            arr.add(str);
            System.out.println("Succcessfull!!!");
        }
        
    }
    void insert()
    {
        int no,pos;
        System.out.print("Enter the number of element:");
        no=scan.nextInt();
        for(int i=1;i<=no;i++)
        {
            System.out.printf("Enter the string %d:",i);
            str=scan.next();
            System.out.print("Enter the position:");
            pos=scan.nextInt();
            if(pos-1 <= arr.size())
            {
               arr.add(pos-1,str);
                System.out.println("Succcessfull!!!");
            }
            else
                System.out.println("\n\nUnable to Insert\n" );
        }
    }
    void search()
    {
        String key;
        int found=0;
        System.out.print("Enter the key to search:");
        key=scan.next();
        for(int i=0;i<arr.size();i++)
        {
            if(key.equals(arr.get(i)))
            {
                found=1;
                System.out.printf("\n The String is found at index:%d  and position:%d\n",i,i+1);
                break;
            }
        }
        if(found==0)
            System.out.println("\nString not found!!!!!\n");
    }
    void find()
    {
        char key;
        int found=0;
        System.out.print("\nEnter the key character to search : ");
        key=scan.next().charAt(0);
        for(String s : arr)
        {
            if(key==s.charAt(0))
            {
                System.out.println(s);
                found=1;
            }
        }
        if(found==0)
          System.out.println(" No elements found!!!! ");
    }
    void display()
    {
        if(arr.size()==0)
            System.out.println("\nArray LIST is Empty.....");
        else
        {
            System.out.println("The elements are:");
            for(String s:arr)
                System.out.println(s);
        }
    }
}
public class Arraylist 
{
    public static void main(String[] args) 
    {
        Method obj=new Method();
        Scanner scan=new Scanner(System.in);
        int ch;
        while(true)
        {
        System.out.print("----------MENU-----------\n\n1.APPEND\n2.INSERT\n3.SEARCH\n4.FIND\n5.Display\n6.Exit\nEnter your choice:");
        ch=scan.nextInt();
        switch(ch)
        {
            case 1:obj.append();
                   break;
            case 2:obj.insert();
                   break;
            case 3:obj.search();
                   break;
            case 4:obj.find();
                   break;
            case 5:
                  obj.display();
                  break;
            case 6:
                   System.exit(0);break;
            default:
                   System.out.println("\nPlease select correct option  ");  
        }
    }
}
}