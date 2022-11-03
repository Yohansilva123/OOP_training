import java.util.List;

public class House {

    private String color;
    private String location;
    private int squareFeet;
    private String ownerName;

    House(String color, String  location, int squareFeet, String ownerName){
        this.color = color;
        this.location = location;
        this.squareFeet = squareFeet;
        this.ownerName = ownerName;
    }

    public String getColor(){
        return this.color;
    }

    public List<Object> getHouseDetails(){
        List<Object> details = null;
        details.add(this.color);
        details.add(this.location);
        details.add(this.squareFeet);
        details.add(this.ownerName);

        return details;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

}
