package Abstract;
abstract class Bike{
    Bike(){
      System.out.println("bike is created");  
    }
    abstract void run();

    void changeGear(){

        System.out.println("gear changed");
    }
}
class Honda extends Bike{
    void run(){
        System.out.println("bike running");
    }
}



public class TestAb {
    public static void main(String[] args) {
        
    
    Bike b=new Honda();
    b.run();
    //b.changeGear();
    }
}
