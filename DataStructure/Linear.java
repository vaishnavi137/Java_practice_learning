
package DataStructure;
import java.util.Scanner;

public class Linear {

        public static void main(String srgs[]){

            int i, n,search;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of elements");
            n=sc.nextInt();

            int array[]=new int[n];

            System.out.println("Enter " + n + " elements");
            for( i=0;i<n;i++ ){
                array[i]=sc.nextInt();
            }

            System.out.println("Enter the number to find:");
            search=sc.nextInt();

            for( i=0;i<n;i++){
                if(array[i]==search){
                    System.out.println("number is present at " +(i+1)+ " location");
                    break;
                }
            }

            if(i==n){
                System.out.println("number not found");
            }

 }




    
}
