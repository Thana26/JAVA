import java.io.*;
import java.util.*;
class Primenumber
{
public static void main(String arg[]){
int c=0,i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
}
}
if(c==2)
{
System.out.println("number"+n+"is prime");
}
else{
System.out.println("is not a prime");
}
}
}