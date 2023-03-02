import java.io.*;
public class Upper{
public static void main(String ards[])
{
String s="Thana";
int count=0;
int i;
byte b[]=s.getBytes();
for(i=0;i<b.length;i++){
if(b[i]>65 && b[i]<90)
{
count++;
}
}
if (count>0)
System.out.println("there is Upper case letters:");
else 
System.out.println("there is no Upper case letters:");
}
}