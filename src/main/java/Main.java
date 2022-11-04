public class Main {

    public static void main(String[] args){

//       Tree oakTree =  new Tree(25,5,TreeType.OAK);
////       System.out.println(oakTree.treeType);
////       System.out.println(oakTree.heightFt);
//       oakTree.grow();
//       oakTree.announceTallTree();
//
//        System.out.println(oakTree.getTrunkDiameter());
//        System.out.println(oakTree.getHeightFt());
//
//        Tree mapleTree = new Tree(110,10,TreeType.MAPLE);
//        mapleTree.announceTallTree();
//
//        Employee newEmployee = new Employee("Yohan", 786, "colombo", 25,EmployeeDesignation.MANAGER);
//        System.out.println("Employee Name" + newEmployee.employeeName);
//        System.out.println("Employee Age" + newEmployee.employeeAge);
//        newEmployee.identifyOldEmployee();
//        newEmployee.identifyManagerEmployee();

        House newHouse = new House("White","Colombo", 1000, "Yohan", HouseType.ONE_STORY);
        newHouse.setOwnerName("Shenali");
        System.out.println(newHouse.color);
    }
}
