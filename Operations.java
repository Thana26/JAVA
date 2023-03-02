import java.io.*;
class Operations
{
int a=2,b=4,c;
boolean p=true,q=false,r;
void bitwise()
{
c=a&b;
System.out.println("a&b="+c);
c=a>>2;
System.out.println("a>>2="+c);
c=a>>>2;
System.out.println("b<<<1="+c);
c=a^b;
System.out.println("a^b="+c);
}
void logical()
{
r=p&&q;
System.out.println("p&&q="+r);
r=p||q;
System.out.println("p||q="+r);
System.out.println("!(p&&q)="+!(p&&q));
}
void relational()
{
System.out.println("a==b="+(a==b));
System.out.println("a!=b="+(a!=b));
System.out.println("a>=b="+(a>=b));
System.out.println("a<=b="+(a<=b));
}
public static void main(String args[])
{
Operations c1=new Operations();
c1.bitwise();
c1.logical();
c1.relational();
}
}
