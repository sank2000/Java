package com.loan;
import com.transact.Transaction;
import java.util.Scanner;
public class LoanAccount 
{
    public String name,acc_no;
    public int amount;
    public void doTransaction()
    {
        int opt;
        Scanner scan=new Scanner(System.in);
        System.out.println("Name   : " + name);
        System.out.println("Acc_no : " + acc_no);
        System.out.println("Amount : " + amount);
        System.out.println("\t\t   TRANSACTION  ");
        System.out.println("\n\t1.CREDIT\n\t2.DEBIT");
        System.out.print("\nSelect your option:");
        opt=scan.nextInt();
        switch(opt)
        {
            case 1:
                Transaction.credit(amount);
                break;
            case 2:
                Transaction.debit(amount);
                break;
            default:
                System.out.println("!oops something went wrong\n");
                break;
        }

        
    }
}
