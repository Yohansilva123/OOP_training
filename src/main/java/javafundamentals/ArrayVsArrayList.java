package javafundamentals;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    public static void main(String []args){
        String[] friendsArray= new String[5];
        String[] friendsArray2 = {"Yohan", "Sheni", "Devon", "Sachin"};

        ArrayList<String> friendsArrayList= new ArrayList<>();
        ArrayList<String> friendsArrayList2 = new ArrayList<>
                (Arrays.asList("Yohan", "Sheni", "Devon", "Sachin"));

        System.out.println(friendsArray2[1]);
        System.out.println(friendsArrayList2.get(1));

        System.out.println(friendsArray2.length);
        System.out.println(friendsArrayList2.size());

        friendsArrayList2.add("Shalini");
        System.out.println(friendsArrayList2.get(4));

        friendsArray2[0] = "Vidusha";
        System.out.println(friendsArray2[0]);
        friendsArrayList2.set(0,"Silva");
        System.out.println(friendsArrayList2.get(0));

        friendsArrayList2.remove(2);
        System.out.println(friendsArrayList2.get(2));

        System.out.println(friendsArrayList2);

        String[] array = new String[6];
        ArrayList<String> arrayList = new ArrayList<>();
    }
}
