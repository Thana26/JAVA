import java.io.*;
public class Number {
public static void main(String ards[])
{
String s="Thana";
int count=0;
int i;
byte b[]=s.getBytes();
for(i=0;i<b.length;i++){
if(b[i]>=48 && b[i]<=57)
{
count++;
}
}
if (count>0)
System.out.println("There is Numbers:");
else 
System.out.println("There is no Numbers:");
}
}
