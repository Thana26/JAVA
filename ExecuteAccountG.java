import java.io.*;
import java.util.*;
class BankAccount
{
static String name,acc_type,acc_no;
static double amount,balance;
int choice;
public Scanner sc=new Scanner(System.in);
void setname(String name1)
{
name=name1;
}
void getname()
{
System.out.println("Name of the account holder : "+ name);
}
void setAccountNo(String acc_no1)
{
acc_no=acc_no1;
}
void getAccountNo()
{
System.out.println("bank account number : "+ acc_no);
}
void settype(String acc_type1)
{
acc_type=acc_type1;
}
void gettype()
{
System.out.println("Type of the account : "+ acc_type);
}
void setbalance(int balance1)
{
balance=balance1;
}
void getbalance()
{
System.out.println("Balance in the account :"+ balance);
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
class ExecuteAccountG
{
public static void main(String args[])
{
BankAccount ob1=new BankAccount();
ob1.setname("Thana");
ob1.getname();
ob1.setAccountNo("9678618067");
ob1.getAccountNo();
ob1.settype("savings");
ob1.gettype();
ob1.setbalance(79000);
ob1.getbalance();
int choice;
Scanner sc=new Scanner(System.in);
while(1==1)
{
System.out.println("1.Display\t2.Deposit\t3.Withdraw\t4.exit\n");
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