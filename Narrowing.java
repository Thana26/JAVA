import java.io.*;
import java.util.*;
public class Narrowing
{
public static void main(String args[])
{
byte b;
int i=257;
double d=323.142;
System.out.println("int to byte conversion");
b=(byte)i;         
System.out.println("i and b values: "+i+" "+b);
System.out.println("double to int conversion");
i=(int)d;
System.out.println("d and i values: "+d+" "+i);
System.out.println("double to byte conversion");
b=(byte)d;
System.out.println("d and b values: "+d+" "+b);
}
}
