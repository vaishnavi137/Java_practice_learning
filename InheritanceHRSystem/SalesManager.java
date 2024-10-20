package InheritanceHRSystem;



public class SalesManager  extends SalesRep{

    double salesTeam;
    
    public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
            int vacationDaysTaken, double salary, int yearWorked, double salesMade, double d) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearWorked, salesMade);
        this.salesTeam=salesTeam;
    }

    public double calculateComission(){
        // 0.03 * all sales made by team
        return +0.03f*salesTeam;
     }
}
