package javaPractice.fUNCTIONS;

import java.util.Scanner;
/*Create a new Java class that will have the following functionality:

Name should be CalculatorBrain
Implement a function for each aritmetic operation
Addition
Subtraction
Multiplication
Division
Add some code to the main method to invoke the aritmetic functions defined and verify it works as expected. */
public class CalculatorBrain {

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the first number:");
            int n1=sc.nextInt();
            System.out.println("enter the secod number:");
            int n2=sc.nextInt();

            System.out.println("Addition is:" + add(n1,n2));
            System.out.println("Substraction is:" + sub(n1,n2));
            System.out.println("multiplication is:" + mult(n1,n2));
            System.out.println("division is:" + div(n1,n2));
         }
    



public static int add(int n1,int n2){
        return (n1+n2);
}
public static int sub(int n1,int n2){
    return (n2-n1);
}
public static int mult(int n1,int n2){
    return (n1*n2);
}
public static float div(int n1,int n2){
    return (n1/n2);
}


}