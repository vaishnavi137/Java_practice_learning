package Generics;
import java.util.ArrayList;
import java.util.List;

abstract class Person{

     abstract void  Details();
}
class Student1 extends Person{

    String name;
    public Student1(String name){
        this.name=name;
    }
    void Details(){
        System.out.println("In the Student oject details method"+this.name);
    }

}
class Employee extends Person{

    String name;
    public Employee(String name){
        this.name=name;
    }
    void Details(){
        System.out.println("In the Student oject details method"+this.name);
    }

}
public class App {

    public static void main(String[] args) {
        
        List<Student1> stud_list=new ArrayList<Student1>();
        stud_list.add(new Student1("vaish"));
        stud_list.add(new Student1("ravi"));
        stud_list.add(new Student1("savi"));
        PrintBaba(stud_list);

        List<Employee> Emp_list=new ArrayList<Employee>();
        Emp_list.add(new Employee("raju employee"));
        Emp_list.add(new Employee("shyam employee"));
        Emp_list.add(new Employee("mahesh employee"));
        PrintBaba(Emp_list);

    }

    public static void PrintBaba(List<? extends Person> templist)
    {
        System.out.println("The delails in the list are as follows");
        for(Person item:templist)
        {
            item.Details();
        }
    }




}
