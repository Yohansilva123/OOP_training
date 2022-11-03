public class Employee {

    String employeeName;
    int employeePhone;
    String employeeLocation;
    int employeeAge;
    EmployeeDesignation employeeDesignation;

    Employee(String employeeName, int employeePhone, String employeeLocation, int employeeAge, EmployeeDesignation employeeDesignation){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeePhone = employeePhone;
        this.employeeLocation = employeeLocation;
        this.employeeDesignation = employeeDesignation;
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
