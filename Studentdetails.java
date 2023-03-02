import java.io.*;
import java.util.*;
class Student
{
String name,branch,sec;
int a,b,c,numb,age;
float avgmarks;
Scanner sc=new Scanner(System.in);
void get()
{
System.out.println("enter the name of student : ");
name=sc.next();
System.out.println("enter the roll number : ");
numb=sc.nextInt();
System.out.println("enter the branch : ");
branch=sc.next();
System.out.println("enter the section : ");
sec=sc.next();
System.out.println("enter the age of the student : ");
age=sc.nextInt();
System.out.println("enter the marks of 3 subjects out of 100 : ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

}
void marks()
{
avgmarks=(a+b+c)/3;
}
void result()
{
System.out.println("Name of the student : "+name);
System.out.println("Roll no of the student : "+numb);
System.out.println("Branch of the student : "+branch);
System.out.println("Section of the student : "+sec);
System.out.println("Average marks of 3 subjects of the student : "+avgmarks);
}
}
class Studentdetails
{
public static void main(String args[])
{
Student ob1=new Student();
ob1.get();
ob1.marks();
Student ob2=new Student();
ob2.get();
ob2.marks();
Student ob3=new Student();
ob3.get();
ob3.marks();
Student ob4=new Student();
ob4.get();
ob4.marks();
Student ob5=new Student();
ob5.get();
ob5.marks();
Student ob6=new Student();
ob6.get();
ob6.marks();
ob1.result();
ob2.result();
ob3.result();
ob4.result();
ob5.result();
ob6.result();
}
}
