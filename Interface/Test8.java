package Interface;

class Animal {
    // superclass
}

interface CanSwim {
    void swim();
}

class Duck extends Animal implements  CanSwim {
    

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}
public class Test8{
    public static void main(String[] args) {
        Duck d=new Duck();
        d.swim();
    }
}
