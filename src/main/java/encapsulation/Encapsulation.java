package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        // Create an object of the Encapsulation.Bank class
        Bank bank = new Bank("Chase", "Downtown", "John Doe", 123456789, 1000.00);
        // Deposit 500
        bank.deposit(500);
        // Withdraw 200
        bank.withdraw(200);

        // Create an object of the Encapsulation.House class
        House house = new House("Blue", "Downtown", 2000, "Jane Doe", HouseType.ONE_STORY);
        // Set the owner name
        house.setOwnerName("Jane Doe");

        // Create an object of the Encapsulation.Tree class
        Tree tree = new Tree(50, 10, TreeType.OAK);
        // Grow the tree
        tree.grow();
        // Announce the tree
        tree.announceTallTree();
    }
}
