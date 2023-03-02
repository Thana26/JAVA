import java.io.*;
import java.util.*;
class Cal
{
int a,b,c,d,e,f;
Scanner sc=new Scanner(System.in);
void get()
{
System.out.println("enter the values of a and b:");
a=sc.nextInt();
b=sc.nextInt();
}
void add()
{
c=a+b;
System.out.println(" the add of " + a +"and" + b + "is" + c);
}
void sub()
{
d=a-b;
System.out.println(" the sub of " +a+ "and" +b+ "is" +d);
}
void div()
{
e=a/b;
System.out.println(" the division of "+a+"and"+b+"is" +e);
}
void multi()
{
f=a*b;
System.out.println( " the multiplicaion of"+a+"and"+b+"is"+f);
}
}
class DemoCal
{
public static void main(String args[])
{
Cal ob1=new Cal();
ob1.get();
ob1.add();
ob1.sub();
ob1.div();
ob1.multi();
Cal ob2=new Cal();
ob2.get();
ob2.add();
ob2.sub();
ob2.div();
ob2.multi();
Cal ob3=new Cal();
ob3.get();
ob3.add();
ob3.sub();
ob3.div();
ob3.multi();
}
}
