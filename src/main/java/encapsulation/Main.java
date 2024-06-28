package encapsulation;

public class Main {

    public static void main(String[] args){

//       Encapsulation.Tree oakTree =  new Encapsulation.Tree(25,5,Encapsulation.TreeType.OAK);
//       System.out.println(oakTree.getHeightFt());
////       System.out.println(oakTree.heightFt);
//       oakTree.grow();
//       oakTree.announceTallTree();
//
//        System.out.println(oakTree.getTrunkDiameter());
//        System.out.println(oakTree.getHeightFt());
//
//        Encapsulation.Tree mapleTree = new Encapsulation.Tree(110,10,Encapsulation.TreeType.MAPLE);
//        mapleTree.announceTallTree();
//
//        Inheritance.Employee newEmployee = new Inheritance.Employee("Yohan", 786, "colombo", 25,Inheritance.EmployeeDesignation.MANAGER);
//        System.out.println("Inheritance.Employee Name" + newEmployee.employeeName);
//        System.out.println("Inheritance.Employee Age" + newEmployee.employeeAge);
//        newEmployee.identifyOldEmployee();
//        newEmployee.identifyManagerEmployee();

//        Encapsulation.House newHouse = new Encapsulation.House("White","Colombo", 1000, "Yohan", Encapsulation.HouseType.ONE_STORY);
//        Encapsulation.House newHouse2 = new Encapsulation.House("Black","Kandana", 2000, "Shenali", Encapsulation.HouseType.TWO_STORY);
//        newHouse.setOwnerName("Shenali");
//        System.out.println(newHouse.color);
//        System.out.println(newHouse2.location);

        Bank bank = new Bank("BOC", "Colombo", "Yohan", 12345, 1000);
        System.out.println(bank.getBankName());
        bank.deposit(1000);
        bank.withdraw(500);
    }
}
