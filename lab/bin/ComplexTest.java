class Complex {
    int a,b;
    Complex(int x,int y)
    {
       a=x;
       b=y;
    }
   static void add(Complex obj1,Complex obj2)
   {
       System.out.println("\nThe Addition of two complex number is "+(obj1.a+obj2.a)+"+i"+(obj1.b+obj2.b) );
   }
   static void sub(Complex obj1,Complex obj2)
   {
       System.out.printf("\nThe Subraction of two complex number is %d + i (%d)",(obj1.a-obj2.a),(obj1.b-obj2.b) );
   }
   static void mul(Complex obj1,Complex obj2)
   {
       System.out.printf("\n\nThe Multiplication of two complex number is %d + i(%d)\n",((obj1.a*obj2.a)-(obj1.b*obj2.b)),((obj1.a*obj2.b)+(obj1.b*obj2.a)));
   }
  static void div(Complex obj1,Complex obj2)
   {
       int a,b,c;
       a=((obj1.a*obj2.a)+(obj1.b*obj2.b));
       b=(-(obj1.a*obj2.b)+(obj1.b*obj2.a));
       c=((obj2.a * obj2.a)+(obj2.b * obj2.b));
       System.out.printf("\n\nThe Multiplication of two complex number is %d + i(%d)/%d\n",a,b,c);
   }
}
public class ComplexTest
{
    public static void main(String []args)
    {
        Complex obj1=new Complex(6,3);
        Complex obj2=new Complex(5,2);
        Complex.add(obj1, obj2);
        Complex.sub(obj1, obj2);
        Complex.mul(obj1, obj2);
        Complex.div(obj1, obj2);
        
        
    }
}