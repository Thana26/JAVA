class NestTry{
public static void main(String args[]){
try{      //monitor a block of code
	int a=args.length;
	int b=8/a;
	System.out.println("a="+a);
	try{
		if(a==1)
		    a=a/(a-a);
		if (a==2){
			int c[]={2};
			c[4]=6;
			}
	    }	
	catch(ArrayIndexOutOfBoundsException e){            
		System.out.println("array index out of bounds: "+e);
	}
}
catch(ArithmeticException e){                //catch divide-by-zero error
System.out.println("Division by zero: "+e);
}
System.out.println("After try/catch statement");
}
}