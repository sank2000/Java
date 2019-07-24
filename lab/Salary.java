import java.util.Scanner;
class Employee 
{
      Scanner scan= new Scanner(System.in); 
      String name,mail,address,mb_num,type;
      int emp_id;
      double da,hra,pf,bf,netPay,grossPay;
      public void get_data()
      {
          System.out.print("\n\nEnter the Employee ID     :");
          emp_id=scan.nextInt();
          System.out.print("Enter the Employee Name   :");
          name=scan.next();
          System.out.print("Enter the Employee Mail ID:");
          mail=scan.next();
          System.out.print("Enter the Employee Address:");
          address=scan.next();
          System.out.print("Enter the Employee Ph.no  :");
          mb_num=scan.next();
          
      }
      public void calculate(double bp)
      {
    	  da = bp * 0.97;
    	  hra =bp * 0.10;
    	  pf = bp * 0.12;
    	  bf = bp * 0.001;
    	  grossPay=bp+da+hra;
    	  netPay=grossPay-(pf-bf);
      }
      void printSlip()
      {
    	   System.out.println("\n_____________________SALARY SLIP________________________\n\n");
    	   System.out.println("EMPLOYEE NAME     :    "+name);
    	   System.out.println("EMPLOYEE ID       :    "+emp_id);
           System.out.println("EMPLOYEE TYPE     :    "+type);
    	   System.out.println("EMPLOYEE MAIL ID  :    "+mail);
           System.out.println("EMPLOYEE PHN.NO   :    "+mb_num);
           System.out.println("EMPLOYEE ADDRESS  :    "+address);
    	   System.out.printf("GROSS SALARY      :    RS.%.2f",grossPay);
    	   System.out.printf("\nNET SALARY        :    RS.%.2f\n",netPay);
    	   
    	   
     }
}
class Professor extends Employee
{
	double bp;
	
}
class AssistantProfessor extends Employee
{
	double bp;
}
class AssociativeProfessor extends Employee
{
	double bp;
}
class Programer extends Employee
{
	double bp;
}

public class Salary {

	public static void main(String[] args)
	{
		int opt;
		Scanner scan= new Scanner(System.in);
		Professor pobj =new Professor();
		AssistantProfessor apobj = new AssistantProfessor();
		AssociativeProfessor aobj =new AssociativeProfessor();
		Programer pgobj = new Programer();
                while(true)
                {
                    System.out.println("\n$$$$$$$$$$           SAN COMPANY          $$$$$$$$$$$$$  \n");
                    System.out.println("\n1.PROFESSOR\n2.ASSISTANT PROFESSOR\n3.ASSOCIATIVE PROFESSOR\n4.PROGRAMMER\n5.EXIT");
                    System.out.print("Select Your Employee Type:");
                    opt=scan.nextInt();
                    switch(opt)
                    {
                    case 1:
                            pobj.bp=100000;
                            pobj.get_data();
                            pobj.type="PROFESSOR";
                            pobj.calculate(pobj.bp);
                            pobj.printSlip();break;
                    case 2:
                            apobj.bp=70000;
                            apobj.get_data();
                            apobj.type="ASSISTANT PROFESSOR";
                            apobj.calculate(apobj.bp);
                            apobj.printSlip();break;
                    case 3:
                            aobj.bp=65000;
                            aobj.get_data();
                            aobj.type="ASSOCIATIVE PROFESSOR";
                            aobj.calculate(aobj.bp);
                            aobj.printSlip();break;
                    case 4:
                            pgobj.bp=120000;
                            pgobj.get_data();
                            pgobj.type="PROGRAMMER";
                            pgobj.calculate(pgobj.bp);
                            pgobj.printSlip();break;
                    case 5:
                           System.exit(0);break;
                    default:
                        System.out.println("\nplease select correct option = ");
                }
       }
		
		
	}

}
