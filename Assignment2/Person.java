package Assignment2;

public class Person {
    //instance variables
    private String firstName;
    private String lastName;
    private  String address;
    private Food favouriteFood;

    //constructor
    public Person(String newFirstName, String newLastName, String newAddress, Food favouriteFood){
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.address = newAddress;
        this.favouriteFood = favouriteFood;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String newFirstName) {
        firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String newLastName) {
        lastName = newLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress( String newAddress) {
        address = newAddress;
    }

    public Food getFavouriteFood(){return favouriteFood;}
}
