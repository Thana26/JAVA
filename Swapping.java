import java.io.*;
import java.util.*;
public class Swapping
{
	public static void main(String args[]) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		a= scan.nextInt();
		System.out.println("enter another number");
		b=scan.nextInt();
		System.out.println("numbers before swapping"+a+"and"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("numbers after swapping"+a+"and"+b);
	}
}

