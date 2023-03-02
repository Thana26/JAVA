package bus;
import java.io.*;
import java.util.*;
class Bus
{
int bus_no,age;
String bus_name,bus_type,name,gender,num;
static int seats=15;
Scanner sc=new Scanner(System.in);
Bus()
{
System.out.println("enter name of the bus :");
bus_name=sc.nextLine();
System.out.println("enter type of the bus :");
bus_type=sc.nextLine();
System.out.println("enter bus number :");
bus_no=sc.nextInt();
System.out.println("enter name of the passenger:");
name=sc.next();
System.out.println("enter gender :");
gender=sc.next();
System.out.println("enter age of passenger:");
age=sc.nextInt();
System.out.println("enter phone number");
num=sc.next();
}
void reservation()
{
if(seats<0)
{
System.out.println("Sorry,seats are not available");
}
else
{
System.out.println("your seat is booked");
seats=seats-1;
}
}
void cancel()
{
System.out.println("your seat is cancelled");
seats=seats+1;
}
void display()
{
System.out.println("you have successfully booked the ticket..please check your details:");
System.out.println("name of the bus : "+bus_name);
System.out.println("type of the bus : "+bus_type);
System.out.println("bus number : "+bus_no);
System.out.println("name of the passenger : "+name);
System.out.println("gender of the passenger : "+gender);
System.out.println("age of the passenger : "+age);
System.out.println("phone number of the passenger : "+num);
}
static void available()
{
System.out.println("total available seats are:"+seats);
}


public static void main(String args[])
{
Bus b1=new Bus();
b1.reservation();
b1.available();
b1.display();
b1.cancel();
b1.available();
b1.reservation();
b1.available();
b1.display();
b1.reservation();
b1.available();
b1.display();
}
}