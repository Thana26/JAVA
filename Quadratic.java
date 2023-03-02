import java.io.*;
import java.util.Scanner;
public class Quadratic {
   public static void main(String args[]){
      double a,b,c,d=0,e=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a ::");
      a = sc.nextDouble();
      System.out.println("Enter the value of b ::");
      b = sc.nextDouble();
      System.out.println("Enter the value of c ::");
      c = sc.nextDouble();
      double determinant = (b*b)-(4*a*c);
      double sqrt = Math.sqrt(determinant);
      if(determinant>0){
         d = (-b + sqrt)/(2*a);
         e = (-b - sqrt)/(2*a);
         System.out.println("Roots are :: "+ d +" and "+e);
      }else if(determinant == 0){
         System.out.println("Root is :: "+(-b + sqrt)/(2*a));
      } else if(determinant<0){
      System.out.println("Roots are complex");
      }
   }
}
