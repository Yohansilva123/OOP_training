package Inheritance;

public class Analyst extends Employee{

    private double bonus;

    public Analyst(String employeeName, int employeePhone, String employeeLocation, int employeeAge, EmployeeDesignation employeeDesignation, double employeeSalary, double bonus){
        super(employeeName, employeePhone, employeeLocation, employeeAge, employeeDesignation, employeeSalary);
        this.bonus = bonus;
    }

    public double getBonus(){
        return this.bonus;
    }

    public void getNetSalary(){
        System.out.println("Net salary is " + calculateNetSalary());
    }

    public double calculateNetSalary(){
        return this.employeeSalary + this.bonus;
    }
}
