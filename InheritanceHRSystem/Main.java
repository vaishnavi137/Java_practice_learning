package InheritanceHRSystem;

public class Main {

    public static void main(String[] args) {
        /* 
    Employee e= new Employee("Rahul", "Mahajan", 10, 25, 2500, 5, 50000, 5);
        System.out.println("Time to retiremnt:" +e.timeToRetirement());
        System.out.println("vacation time left:" + e.vacationDaysTaken);
        System.out.println("Bonus:" +e.calculateBonus());
        */

        SalesRep s1=new SalesRep("krishna", "goel", 11, 28, 700, 5, 60000, 3,10000 );
        SalesRep s2=new SalesRep("b","ss",10,25,750,8,40000,4,10000);
        SalesRep s3=new SalesRep("c","ss",10,25,800,8,40000,4,10000);

        SalesManager sm=new SalesManager("raj", "sss", 10, 27, 730, 5, 30000, 2, 30000,s1.getSalesMade()+s2.getSalesMade()+s3.getSalesMade());
        System.out.println(s1.getSalesMade()+s2.getSalesMade()+s3.getSalesMade());
        System.out.println(sm.calculateComission());
       


    }
    
}
