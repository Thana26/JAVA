import java.io.*;
import java.util.*;
public class Greaterofthree
{
	public static void main(String args[]) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number");
		a=scan.nextInt();
		System.out.println("enter second number");
		b=scan.nextInt();
		System.out.println("enter third number");
		c=scan.nextInt();
		if((a>b)&&(a>c))
		{
		    System.out.println(a+"is the greatest number");
		}
		else if(b>c)
		{
		    System.out.println(b+"is the greatest number");
		}
		else
		{
		    System.out.println(c+"is the greatest number");
		}
		}
	}
