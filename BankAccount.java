import java.io.*;
import java.util.*;
class BankAccount
{
String name,acc_type,acc_no;
double amount,balance;
int choice;
public Scanner sc=new Scanner(System.in);
BankAccount()
{
balance=0;
}
BankAccount(String nam,String type,String no,double bal)
{
name=nam;
acc_type=type;
acc_no=no;
balance=bal;
}
void display()
{
System.out.println("Name of the account holder : "+ name);
System.out.println("Type of the account : "+ acc_type);
System.out.println("bank account number : "+ acc_no);
System.out.println("Balance in the account :"+ balance);
}
void deposit()
{
System.out.println("enter the amount to credit :");
amount=sc.nextDouble();
balance=balance+amount;
System.out.println(" Total balance after credit:"+ balance);
}
void withdraw()
{
System.out.println("enter the amount to debit :");
amount=sc.nextDouble();
if(amount>balance)
{
System.out.println("cant withdraw the amount u entered...Insufficent Balance");
}
else
{
balance=balance-amount;
System.out.println(" Total balance after debit:"+balance);
}
}
}
class ExecuteAccountA
{
public static void main(String args[])
{
BankAccount ob1=new BankAccount("Ram","Savings","9175782681",14000);
int choice;
Scanner sc=new Scanner(System.in);
while(1==1)
{
System.out.println("1.Display\n2.Deposit\n3.Withdraw\n4.exit");
System.out.println("enter your choice:");
choice=sc.nextInt();
switch (choice)
{
case 1:
ob1.display();
break;
case 2:
ob1.deposit();
break;
case 3:
ob1.withdraw();
break;
case 4:
System. exit(0);
default:
System.out.println("you entered wrong choice");
}
}
}
}
