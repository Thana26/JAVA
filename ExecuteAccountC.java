import java.io.*;
import java.util.*;
class BankAccount
{
String name,acc_type,acc_no;
double amount,balance;
static int count;
int choice;
public Scanner sc=new Scanner(System.in);
BankAccount()
{
balance=0;
}
BankAccount(String nam,String type,String no,double bal)
{
count=count+1;
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
static void displayholders()
{
System.out.println("total account holders in this bank :"+count);
}
}
class ExecuteAccountC
{
public static void main(String args[])
{
BankAccount ob[]=new BankAccount[5];
ob[0]=new BankAccount("Thana","current","9876928067",10000);
ob[1]=new BankAccount("N.Sanjay","Savings","9718618067",6000);
ob[2]=new BankAccount("rajesh","Savings","9534986577",8000);
ob[3]=new BankAccount("Shivateja","checkings","9783003067",12000);
ob[4]=new BankAccount("Asrith","current","7896436886",40000);
int choice;
Scanner sc=new Scanner(System.in);
while(1==1)
{
System.out.println("1.Display\n2.Deposit\n3.Withdraw\n4.Displayholders\n5.exit");
System.out.println("enter your choice:");
choice=sc.nextInt();
switch (choice)
{
case 1:
ob[0].display();
ob[1].display();
ob[2].display();
ob[3].display();
ob[4].display();
break;
case 2:
ob[0].deposit();
break;
case 3:
ob[0].withdraw();
break;
case 4:
ob[0].displayholders();
break;
case 5:
System. exit(0);
default:
System.out.println("you entered wrong choice");
}
}
}
}
