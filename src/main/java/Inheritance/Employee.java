package Inheritance;

public class Employee {

    protected String employeeName;
    protected int employeePhone;
    protected String employeeLocation;
    protected int employeeAge;
    protected EmployeeDesignation employeeDesignation;
    protected double employeeSalary;

    Employee(String employeeName, int employeePhone, String employeeLocation, int employeeAge, EmployeeDesignation employeeDesignation, double employeeSalary){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeePhone = employeePhone;
        this.employeeLocation = employeeLocation;
        this.employeeDesignation = employeeDesignation;
        this.employeeSalary = employeeSalary;
    }

    void identifyManagerEmployee(){
        if (this.employeeDesignation.equals(EmployeeDesignation.MANAGER)){
            System.out.println("This is a manager employee");
        }
    }

    void identifyOldEmployee(){
        if (this.employeeAge>30){
            System.out.println("This is an old employee");
        }
    }

}
