import java.io.*;
import java.util.*;
class claculator1{
int a,b,c,d,e,f;
Scanner sc = new Scanner(System.in);
void getValues(){
System.out.println("Enter the values of a and b");
a=sc.nextInt();
b=sc.nextInt();
}
void add(){
c=a+b;
System.out.println("Addition is "+c);
}
void sub(){
d=a-b;
System.out.println("Subtraction is "+d);
}
void multi(){
e=a*b;
System.out.println("Multipilcation is "+e);
}
void div(){
f=a/b;
System.out.println("Division is "+f);
}
}
class Democalculator1{
public static void main(String args[]){
calculator1 c1 = new calculator1();
c1.getValues();
c1.add();
c1.sub();
c1.multi();
c1.div();
calculator1 c2 = new calculator1();
c2.getValues();
c2.add();
c2.sub();
c2.multi();
c2.div();
calculator1 c3 = new calculator1();
c3.getValues();
c3.add();
c3.sub();
c3.multi();
c3.div();
}
}
