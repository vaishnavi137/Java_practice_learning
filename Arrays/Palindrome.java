import java.util.Scanner;
public class Palindrome {

    public static void main(String args[])
{

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    int n=sc.nextInt();
    int rev,sum=0;
    int temp=n;
    
    while(n>0) {
        rev=n%10;
        sum=sum*10+rev;
        n=n/10;
    }
    if(temp==sum)
    {
        System.out.println("the number is palindrome:");
    }





        }
















}    

