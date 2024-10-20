package InheritanceHRSystem;

public class Employee {

    String firstName;
    String lastName;
    int registration;
    int age;
    int daysWorked;
    int vacationDaysTaken;
    double salary;
    int yearWorked;

    

    public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
            double salary, int yearWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearWorked = yearWorked;
    }

    public int timeToRetirement(){
        // time to retirement = min(60 - age, 40 - yearsWorked)
        return Math.min(60- age,40- yearWorked);
     }
  
     public int vacationTimeLeft(){
         // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
         return (int)((daysWorked/360.0)*(30-vacationDaysTaken));
     }
  
     public double calculateBonus(){
         // bonus = 2.2*salary
         return  (2.2 * salary);
     }







    
}
