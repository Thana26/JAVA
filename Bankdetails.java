import java.io.*;
import java.util.*;
class Account
{
String name,acc_type,acc_no;
int deposit,credit,amount,balance,debit;
Scanner sc=new Scanner(System.in);
void get()
{
System.out.println("enter the name of the account holder :");
name=sc.nextLine();
System.out.println("enter the type of the bank :");
acc_type=sc.next();
System.out.println("enter the bank account number : ");
acc_no=sc.next();
System.out.println("enter the balance in the bank : ");
balance=sc.nextInt();
}
void result()
{
System.out.println("Name of the account holder : "+ name);
System.out.println("Type of the account : "+ acc_type);
System.out.println("bank account number : "+ acc_no);
System.out.println("Balance in the account :"+ balance);
}
void deposit()
{
credit=sc.nextInt();
}
void withdraw()
{
debit=sc.nextInt();
}
}
class Bankdetails
{
public static void main(String args[])
{
Account ob1=new Account();
ob1.get();
System.out.println(" enter the amount to credit into the account :");
ob1.deposit();
int balance=ob1.balance+ob1.credit;
ob1.result();
System.out.println(" Total balance after credit:"+ balance);
System.out.println(" enter the amount to debit : ");
ob1.withdraw();
int amount=ob1.balance-ob1.debit;
System.out.println(" Total balance after debit:"+amount);
}
}
