import java.io.*;
import java.util.*;
public class Leapyear
{
	public static void main(String args[]) {
	int a;
	    Scanner scan=new Scanner (System.in);
		System.out.println("Enter the year");
		a=scan.nextInt();
		if(a%4==0)
		{
		    System.out.println("It is a leap year");
		}
		else
		{
		    System.out.println("It is not a leap year");
		}
	}
	}
