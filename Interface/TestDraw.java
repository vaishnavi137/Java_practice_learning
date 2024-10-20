package Interface;
interface Drawable{
    void draw();
}
class Reactangle implements Drawable{
   public  void draw(){
       System.out.println("deawing rectangle");
   }
}
class Circle implements Drawable{
    public void draw(){
       System.out.println("drawing circle");
   }


public class TestDraw {

    public static void main(String[] args) {
        
        Drawable d=new Circle();
        d.draw();
    }
    
}
}
