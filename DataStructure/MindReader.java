package DataStructure;
import java.util.Scanner;
import java.util.Random;
public class MindReader {
    
   


    public static void main(String[] args) {
        Random r=new Random();
        int p_scr=0,c_scr=0;
        int c_prad=1;
        int p_input;
        int pradiction;
        Scanner s=new Scanner(System.in);
        System.out.println("how many times you want to toss coin:");
        int n =s.nextInt();
        System.out.println("enter your input:");

        for(int i=0;i<n;i++){
            
            p_input=s.nextInt();

            pradiction =(int)r.nextInt(2);
            c_prad =(int)r.nextInt(2);

            if(p_input==pradiction){
                p_scr++;
            }
            
            if(c_prad==pradiction){
                c_scr++;
            }
             if(p_scr>c_scr){
                System.out.println("player won...");
             }
             else if(c_scr<p_scr){
                System.out.println("computer won...");

}
        }
    }
}
