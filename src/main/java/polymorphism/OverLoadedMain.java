package polymorphism;

public class OverLoadedMain {

    public static void main(String []args){

        ContactDetails contactDetails = new ContactDetails("Yohan", "yohan@gmail",
                new PhoneNumber("4378303762"));
        ContactDetails contactDetails2 = new ContactDetails("Sheanli", "shenali@gmail.com");
        ContactDetails contactDetails3 = new ContactDetails("Yohan Silva",
                new PhoneNumber("14378303762"));

        System.out.println(contactDetails2.getName());
        System.out.println(contactDetails);
        System.out.println(contactDetails2);
        System.out.println(contactDetails3);
    }
}
