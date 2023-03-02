import java.io.*;
public class Special_char{
public static void main(String ards[])
{
String s="Thana";
int count=0;
int i;
byte b[]=s.getBytes();
for(i=0;i<b.length;i++){
if((b[i]>=32 && b[i]<=47)||(b[i]>=58 && b[i]<=64)||(b[i]>=91 && b[i]<=96)||(b[i]>=123 && b[i]<=126))
{
count++;
}
}
if (count>0)
System.out.println("There is Special_char");
else 
System.out.println("There is no Special_char");
}
}
