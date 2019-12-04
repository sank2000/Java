class Grandparent
{
    void print()
    {
        System.out.println("This is Grandparent class method");
       }
        
}
class Parent extends Grandparent
{
    void print()
    {
        System.out.println("This is parent class method");
    }
}
class Child extends Grandparent
{
    void print()
    {
        System.out.println("This is Child class method");
    }
}
public class Runtime {

     public static void main(String[] args) 
     {
        Child c=new Child();
        Parent p=new Parent();
        Grandparent g= new Grandparent();
        Grandparent gref;
        gref = c;
        System.out.println("\n\tCall with c obj");
        gref.print();
        gref =p;
        System.out.println("\tCall with p obj");
        gref.print();
        gref =g;
        System.out.println("\tCall with g obj");
        gref.print();
        
       
    }
    
}
