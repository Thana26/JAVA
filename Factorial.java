import java.io.*;
import java.util.*;
public class Factorial
{
	public static void main(String args[]) {
	int a,i,n=1;
	    Scanner scan=new Scanner (System.in);
		System.out.println("Enter a number");
		a=scan.nextInt();
		for(i=1;i<=a;i++)
		{
		    n=n*i;
		}
		System.out.println("the factorial of given number is" +n);
	}
	}
