import java.io.*;
import java.util.*;
class Bank_account
{
String name,acc_type,acc_no;
double amount,balance;
int choice;
public Scanner sc=new Scanner(System.in);
Bank_account()
{
balance=0;
}
Bank_account(String name,String type,String no,double balance)
{
name=name;
acc_type=type;
acc_no=no;
balance=balance;
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
class Bank_account98
{
public static void main(String[] args)
{
Bank_account B1=new Bank_account("Ram","Savings","9898989898",14000);
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
B1.display();
break;
case 2:
B1.deposit();
break;
case 3:
B1.withdraw();
break;
case 4:
System. exit(0);
default:
System.out.println("you entered wrong choice");
}
}
}
}