package InheritanceHRSystem;

public class SalesRep  extends Employee{

    private double salesMade;
    

    public double getSalesMade() {
        return salesMade;
    }


    public void setSalesMade(double salesMade) {
        this.salesMade = salesMade;
    }


    public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
            double salary, int yearWorked,double salesMade) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearWorked);
       
        this.salesMade=salesMade;
    }

    
    public double calculateComission(){
        // comission = 0.1 * salesMade
        return (0.1*salesMade);
     }















    
}
