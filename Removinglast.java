import java.io.*;
public class Removinglast{
public static void main(String ard[]){
String s="Thana";
int i;
System.out.println("String is"+s);
char c[]=s.toCharArray();
c[0]=c[c.length-1]=0;
String s2=new String(c);
System.out.println("After removing string:"+s2);
}
}
