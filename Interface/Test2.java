package Interface;

interface Printable{
    void print();
}
interface Showable{
    void show();
}
class Test2  implements printable,Showable
{
    public void print(){
        System.out.println("hello print");
    }
    public void show(){
        System.out.println("welcome Show");
    }

    public static void main(String[] args) {
        Test2 t=new Test2();
        t.print();
        t.show();
    }
}
