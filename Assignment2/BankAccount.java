package Assignment2;

public class BankAccount {
    //instance variables
    private int accNum;
    private int balance;
    private Person person;

    //constructor
    public BankAccount(int newAccNum, int newBalance, Person person){
        this.accNum = newAccNum;
        this.balance = newBalance;
        //creating composition between BankAccount and Person
        this.person = person;
    }

    //display method
    public void display(){
        System.out.println("Account holder: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Account holder address: " + person.getAddress());
        System.out.println("Account Number: " + accNum);
        System.out.println("Balance " + balance);

    }

    //string method
    public String toString() {
        return "This persons name is " + person.getFirstName() + " " + person.getLastName() + ". Their address is "
                + person.getAddress() + ". Their account number is " + accNum + " and their balance is " + balance;
    }

    //getters and setters
    //only get account number as it is immutable meaning we do not want to reset it ever
    public int getAccNum() {
        return accNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance( int newBalance) {
        balance = newBalance;
    }

    //getter and setter of Person class
    public Person getPerson() {
        return person;
    }

    public void Person( Person newPerson) {
        person = newPerson;
    }
}



