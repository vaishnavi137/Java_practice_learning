package Generics;


class Piku<T>{
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}
public class Test {

    public static void main(String[] args) {
        
        Piku<String> sp=new Piku<String>();
        sp.add("vaish");
        System.out.println("The value of obj is:" +sp.get());

        Piku<Integer> ip=new Piku<Integer>();
        ip.add(11);
        System.out.println("The value of obj is:" +sp.get());

        printGen(17);
        printGen(11.5);
        printGen("Vaishnavi");







    }
    public static <E> void printGen(E dataE){
        System.out.println("the data received is ......" + dataE);
    }
    

}
