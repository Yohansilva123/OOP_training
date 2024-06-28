package Inheritance;

public class Inheritance {

    public static void main(String[] args) {
        Analyst newAnalyst = new Analyst("John Doe", 123456789, "Downtown", 25, EmployeeDesignation.ANALYST, 50000.00, 5000.00);
        System.out.println(newAnalyst.getBonus());
        newAnalyst.getNetSalary();
    }
}
