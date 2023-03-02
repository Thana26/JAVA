import java.io.*;
import java.util.*;
class Fibonacci
{
	public static void main(String args[]) {
	int a,b,i,n=10;
	    Scanner scan=new Scanner (System.in);
		System.out.println("Enter a number");
		a=scan.nextInt();
		System.out.println("Enter a number");
		b=scan.nextInt();
	    System.out.print("First " + n + " terms: ");
    for (i = 1; i <= n; ++i)
        {
            System.out.print(a + " + ");

            int sum = a+b;
            a = b;
            b = sum;
        }
	}
	} 
