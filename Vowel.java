import java.io.*;
import java.util.*;
public class Vowel
{
	public static void main(String args[]) {
	char ch;
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter the alphabet");
	ch=scan.next().charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	    System.out.println("It is a vowel");
	}
	else{
	    System.out.println("It is not a vowel");
	}
	}
	}
