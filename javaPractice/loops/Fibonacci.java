package javaPractice.loops;
import java.util.Scanner;
public class Fibonacci {
    
        public static void main(String args[]){

          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number:");
          int n=sc.nextInt(); 
          
          int a=0,b=1,fib=0;

          int count=2;
          do{
            fib=a+b;
            a=b;
            b=fib;
            count++;
          }while(count <=n);

          System.out.println("Fibonacci (" +n +")= " + fib);


 }

}
