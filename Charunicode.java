import java.io.*;
import java.util.*;
public class Charunicode{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s;
System.out.println("enter the String");
s=sc.next();
System.out.println("enter the index");
int index=sc.nextByte();
int d=s.charAt(index);
System.out.println("unicode of "+s.charAt(index)+" at index:"+index+" is "+d);
}
}
