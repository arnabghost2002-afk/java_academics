abstract class Employee{
    int employeeID;
    String designation;
    Employee(int employeeID, String designation){
        this.employeeID = employeeID;
        this.designation = designation;
    }
    abstract double calculateSalary();
    abstract double calculateBonus();
    void display(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " +( calculateSalary()+ calculateBonus()));
    }
}
class FullTimeEmployee extends Employee {
    double dailyRate;
    int daysWorked;
    FullTimeEmployee(int employeeID, String designation, double dailyRate, int daysWorked) {
        super(employeeID, designation);
        this.dailyRate = dailyRate;
        this.daysWorked = daysWorked;
    }
    @Override
    double calculateSalary() {
        return dailyRate * daysWorked;
    }
    @Override
    double calculateBonus() {
        return calculateSalary() * .80;
    }
}
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    PartTimeEmployee(int employeeID, String designation, double hourlyRate, int hoursWorked) {
        super(employeeID, designation);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    @Override
    double calculateBonus() {
        return calculateSalary() * .50;
    }
}


public class test {
    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee(101, "Manager", 2000, 25);

        Employee emp2 = new PartTimeEmployee(102, "Assistant", 300, 80);

        System.out.println("Full Time Employee");
        emp1.display();

        System.out.println();

        System.out.println("Part Time Employee");
        emp2.display();
    }
}
