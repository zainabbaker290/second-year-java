package Assignment2;

public class LoanAccount extends BankAccount{
    //instance variables
    private int overdraftLimit;

    //constructor
    public LoanAccount(int newAccNum, int newBalance, Person person, int newOverdraftLimit) {
        //inheriting variables from superclass BankAccount
        super(newAccNum, newBalance, person);
        //variable specific to subclass LoanAccount
        this.overdraftLimit = newOverdraftLimit;
    }

    //getters and setters
    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int newOverdraftLimit){
        overdraftLimit = newOverdraftLimit;
    }

    //display method
    public void display(){
        super.display(); //inherits from superclass
        System.out.println("overdraft limit:  " + overdraftLimit); //displays overdraft which is specific for subclass

    }

    //overriding string method
    public String toString() {
        //inherits from superclass but also adds overdraft which is specific to subclass
        return super.toString() + " and the overdraft limit of this account is " + overdraftLimit;
    }
}
