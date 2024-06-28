package encapsulation;

import java.util.List;

public class House {

    public String color;
    public String location;
    public int squareFeet;
    public String ownerName;
    public HouseType houseType;

    House(String color, String  location, int squareFeet, String ownerName, HouseType houseType){
        this.color = color;
        this.location = location;
        this.squareFeet = squareFeet;
        this.ownerName = ownerName;
        this.houseType = houseType;
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

//    public String

}
