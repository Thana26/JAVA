import java.io.*;
import java.util.*;
public class Palindrom1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s;
System.out.println(System.in);
s=sc.next();
StringBuffer buffer=new StringBuffer(s);
buffer.reverse();
String s2=buffer.toString();
if(s2.equals(s))
System.out.println(s+"is a palindrom");
else
System.out.println(s+"is not a palindrom");
}
}