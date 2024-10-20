package DataStructure.Mind_Reader;
import java.util.*;

class Player_A{
        int p_scr=0;
        String name;
        int p_input;

        public Player_A(String namepassed){
            this.name=namepassed;
        }
      public  void playerDetails(){
            System.out.println("name of player is:" + name);
            System.out.println("Player Score=" +p_scr);
        }
}
class Computer{
    int c_scr=0;
    String name="Bahubali";
    int c_pred;

    public int prediction(){
        Random r= new Random();
        return r.nextInt(2);
    }
    public  void playerDetails(){
        System.out.println("name of player is:" + name);
        System.out.println("Player Score=" +c_scr);
    }
}
public class MindReader {

    public static void main(String[] args) {
        
       Player_A P=new Player_A("kattappa");
       Computer C=new Computer();

        Scanner sc = new Scanner(System.in);
        for(;;)
        {
            System.out.println("Enter your Input");
            P.p_input = sc.nextInt();
            System.out.println("You Entered"+P.p_input);
            C.c_pred=C.prediction();
            System.out.println("Prediction:" + C.c_pred);

            if(P.p_input == C.c_pred)
            {
                C.c_scr++;
            }
            else{
                P.p_scr++;
            }

            System.out.println("Computer Score"+C.c_scr);
            System.out.println("Player Score"+P.p_scr);

            if(C.c_scr == 4){
                System.out.println("Computer won");
                break;
            }
            else if(P.p_scr == 4){
                System.out.println("Player win the game");
                break;


}
        }
    }
}
