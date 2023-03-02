import java.io.*;
import java.util.*;
public class Endswith{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str;
System.out.println("enter string ");
str=sc.next();
if(str.endsWith("wel"))
System.out.println(str+" ends with 'wel' ");
else
System.out.println(str+" doesnt end wuth 'wel'");
}
}
