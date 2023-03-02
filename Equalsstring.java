import java.io.*;
import java.util.*;
public class Equalsstring{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s1;
System.out.println("enter String");
s1=sc.next();
String s2;
System.out.println("enter the string");
s2=sc.next();
if(s1.equalsIgnoreCase(s2))
System.out.println(s1+"contain same as"+s2);
else
System.out.println(s1+"not contain same as"+s2);
}
}