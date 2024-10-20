package Constructor;
public class ConstructorChaining {

    ConstructorChaining(){
        //this("vaish");
        System.out.println("default constructor");
        }

    ConstructorChaining(String name){
        this();
        System.out.println(
            "printing from parameterized constructor " + name);
        }
        

         public static void main(String[] args) {
            ConstructorChaining c= new ConstructorChaining();
            ConstructorChaining s=new ConstructorChaining("vaishnavi");
         }
        
        




}
