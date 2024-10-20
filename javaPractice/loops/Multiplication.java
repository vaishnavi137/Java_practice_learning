package javaPractice.loops;
import java.util.Scanner;
public class Multiplication {
    
    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int product=0,multiplicant=1;
	        
	        System.out.print("Enter any positive integer: ");
	        int limit= console.nextInt();
	                
            while(multiplicant<=limit){
	      
                int multiplier=1;
	        while(multiplier<=10){
                product=multiplicant * multiplier;
                System.out.println(multiplicant + "*" + multiplier+"=" + product);
                multiplier ++;
            }
            System.out.println();
            multiplicant++;
        }
}
}