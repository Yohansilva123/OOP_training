package javafundamentals;

public class Names {

    public static boolean isEligible(String name, int age){

        if (name.equals("Yohan")&& age>18){
            return true;
        }
        else if (name.contains("Silva")|| age == 18){
            return true;
        }
        else return false;
    }
}
