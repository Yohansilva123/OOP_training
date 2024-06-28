package javafundamentals;

public class JavaMain {

    public static void main(String[] args){

        int item = 1;
        double item2 = 2.89;

        double answ = item * item2;

        System.out.println(answ);

        printName("Yohan", 9);
        printName("Yohan", 5);
        printName("shenali", 2);
        printName("she", 10);
        printName("sh", 10);

        printLoop("Yo");
        printLoop("Shenali");

        if (Names.isEligible("Yohan", 16)){
            System.out.println("User is Eligible");
        }else System.out.println("user is Not Eligible");
    }

    private static void printName(String name, int number){
        if (name.equals("Yohan")&& number == 9){
            System.out.println("Yohan was sent");
        }
        else if (name.contains("she")|| number < 10){
            System.out.println("Other name was sent");
        }
        else {
            System.out.println("Unexpected name was obsevred");
        }
    }

    private static void printLoop(String name){

        for (int i = 0; i< name.length(); i++){
            System.out.println(name);
        }
    }
}
