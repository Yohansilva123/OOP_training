package polymorphism;

public class ContactDetails {

    private String name;
    private String address;
    private PhoneNumber phoneNumber;

    public ContactDetails(String name, String address, PhoneNumber phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public ContactDetails(String name, String address){
        this.name = name;
        this.address = address;
    }

    public ContactDetails(String name, PhoneNumber phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
