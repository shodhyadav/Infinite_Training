class Address {

    private String doorNo;
    private String street;

    public Address(String doorNo, String street) {
        this.doorNo = doorNo;
        this.street = street;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    //Uncomment the code given below
    @Override
    public String toString() {
        return "Address\nDoor No: " + doorNo + "\nStreet: " + street;
    }
}

public class toStringMethod {
    public static void main(String[] args) {
        Address addressOne = new Address("11","Oxford Street");

        System.out.println();
        System.out.println("Address details of addressOne");
        System.out.println(addressOne);

    }
}