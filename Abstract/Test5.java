package Abstract;

abstract class Shape{
     void draw(){
        System.out.println("draw");
     }
}
class Reactangle extends Shape{
   void draw(){
       System.out.println("drawing rectangle");
   }
}


public class Test5 {
   
   public static void main(String[] args) {
       Shape s=new Reactangle();
       s.draw();
   }
}

