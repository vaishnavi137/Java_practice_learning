public class Test {
    
       
        public static void main(String args []){

            Integer obj1=Integer.valueOf(2);
            Integer obj2=Integer.valueOf(8);

            System.out.println(obj1.equals(obj2));
            //equals() function
            //parameter to be passed
            //return type
            //example
            //The equals() method checks whether two objects are equal.
            //The equals() method takes a single parameter.
            //obj - object which is to be compared with the current object
            //equals() Return Values
            //returns true if two objects are equal
            //returns false if two objects are not equal


            System.out.println(obj1.compareTo(obj2));


            System.out.println(Integer.hashCode(obj2));

            System.out.println(Integer.toString(obj2));

            System.out.println(obj1.byteValue());

















        }

    
}
