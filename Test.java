import java.util.*;
class Test {
        int i,j;
	void check(int num) {
		System.out.println ("Prime numbers up to "+num+" are:");
               	 for(i=2;i<num;i++){
                       	 for( j=2;j<i;j++) {
				if(i%j==0){
				break;
				}
		      	 }
                        if(i==j){
		   System.out.println(i);
		   }
	          }
          }

} //end of class Test
public class prime {
	public static void main(String args[ ]) {
		Test obj1=new Test();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=input.nextInt();
		obj1.check(n);
	}
}
