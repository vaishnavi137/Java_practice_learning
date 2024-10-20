import java.util.Scanner;
public class Prime {


        public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check prime or not:");
		int n=sc.nextInt();
		
		int flag=0;

        if(n==0 || n==1){
            System.out.println("number is not prime");
        }else
        {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("number is  not  prime ");
				flag=1;
				break;
			}
		}
			if(flag==0)
				System.out.println("number is  prime ");
    }
				
		
	}
}

