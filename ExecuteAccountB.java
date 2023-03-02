import java.io.*;
import java.util.*;
class BankAccount
{
String name,acc_type,acc_no;
double amount,balance;
int choice;
static int count=0;
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
System.out.println("total number of acount holders in this bank :"+count);
}
}
class ExecuteAccountB
{
public static void main(String args[])
{
BankAccount ob1=new BankAccount("Ram","Savings","8688618067",6000);
BankAccount ob2=new BankAccount("rahul","current","8519928067",10000);
BankAccount ob3=new BankAccount("Ramesh","Checking","9876543210",9000);
int choice;
Scanner sc=new Scanner(System.in);
while(1==1)
{
System.out.println("1.Display\n2.Deposit\n3.Withdraw\n4.display holders\n5.exit");
System.out.println("enter your choice:");
choice=sc.nextInt();
switch (choice)
{
case 1:
System.out.println("1st holder details :\n");
ob1.display();
System.out.println("2nd holder details :\n");
ob2.display();
System.out.println("3rd holder details :\n");
ob3.display();
break;
case 2:
ob1.deposit();
break;
case 3:
ob1.withdraw();
break;
case 4:
ob1.displayholders();
break;
case 5:
System. exit(0);
default:
System.out.println("you entered wrong choice");
}
}
}
}
