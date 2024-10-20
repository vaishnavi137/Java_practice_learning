package Abstract;

abstract class Animal{
    abstract void sound();
}

class car{
    void speed(){
        System.out.println("speed ");
    }
}
public class TestAnonymous {
    
    public static void main(String[] args) {
        Animal a=new Animal() {
            void sound(){
                System.out.println("meow");
            }
        };
        a.sound();
        car c1=new car(){
            void speed(){
                System.out.println("called in anonymous");
            }
           
        };
        c1.speed();
    }

}
