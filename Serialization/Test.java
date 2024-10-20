package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    int id;
    String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

}
public class Test {
    
    public static void main(String[] args) {
        
        try{
            Student s1=new Student(211,"ravi");
            Student s2=new Student(211,"vaish");
            Student s3=new Student(211,"tejas");


            FileOutputStream fout=new FileOutputStream("f.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.writeObject(s2);
            out.writeObject(s3);
            out.flush();
            out.close();
            System.out.println("success");  
            }catch(Exception e){
            System.out.println(e);
        }

        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
            while(true){
            Student s=(Student)in.readObject();
            System.out.println(s.id +"" +s.name);

            in.close();
            break;
            }
            
        }catch(Exception e){
            System.out.println(e);

        }










    }
}
