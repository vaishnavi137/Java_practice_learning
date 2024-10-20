package javaPractice;
import java.util.Scanner;
/* Movie Discounts
A movie cinema does price discounting depending on a customer's age.
The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
Age range	Ticket Price
Normal ticket	7 Euros
Below 5	60% Discount
Over 60	55% Discount
Write the app so that the conditions above are met and the correct ticket price is returned */
public class MovieDiscount {
    
    public static void main(String args []){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the age: ");
        int age=sc.nextInt();
        int discount=0;

        float t_fare=7.0f;
        float amountpayable=0.0f;

        if (age<5 && age<0)
        {
            discount=60;
            amountpayable=t_fare-calcCharges(discount,t_fare);
            System.out.println("The fare for ticket is "+t_fare);
            System.out.println("The Discount of "+discount+" and the amount payable is"+amountpayable);
        }
        else if(age>60 && age<=100)
        {
            discount=55;
            amountpayable=t_fare-calcCharges(discount,t_fare);
            System.out.println("The fare for ticket is "+t_fare);
            System.out.println("The Discount of "+discount+" and the amount payable is"+amountpayable);
        }
        else
        {

            discount=0;
            amountpayable=t_fare-calcCharges(discount,t_fare);
            System.out.println("The fare for ticket is "+t_fare);
            System.out.println("The Discount of "+discount+" and the amount payable is"+amountpayable);

        }


        
    



    }//end of main
    //fuction for Discount calculation 

   public static float calcCharges(int discount,float t_fare )
   {
    return (discount*t_fare)/100;
   }

        

        
    
}


