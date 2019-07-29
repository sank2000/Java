import com.loan.*;
public class Bank 
{
    public static void main(String[] args) 
    {
        LoanAccount obj=new LoanAccount();
        obj.name=args[0];
        obj.acc_no=args[1];
        obj.amount=Integer.parseInt(args[2]);
//       obj.amount=100;
//       obj.name="san";
//       obj.acc_no="810018104080";
        obj.doTransaction();
        
    }
    
}
