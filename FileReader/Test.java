package FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Test {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String userName=sc.nextLine();
        System.out.println("Enter your surname");
        String surName=sc.nextLine();

       

        try(FileWriter w=new FileWriter("D:\\JFDJD\\javapractice\\FileReader\\file.txt",true )){

            w.write(userName +" "+surName );

            w.close();
            System.out.println("content display");

        }catch(IOException e){
            System.out.println("an error occured" +e);
        }




















    }
}
