import java.io.*;
public class Lower{
public static void main(String ards[])
{
String s="Thana";
int count=0;
int i;
byte b[]=s.getBytes();
for(i=0;i<b.length;i++){
if(b[i]>97 && b[i]<122)
{
count++;
}
}
if (count>0)
System.out.println("There is Lower case letters:");
else 
System.out.println("There is no Lower case letters:");
}
}
