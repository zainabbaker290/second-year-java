package Assignment2;

import java.util.HashSet;
import java.util.Iterator;

public class AccountTest {
    public static void main(String[] args) {
        System.out.println("Start of account testing");

        Person person1 = new Person("laura", "hayes", "Wilton road",
                new Vegetable("Carrot", 100, 0.05, 0.02,
                        0.8, 0.03, 0.9));
        // creating bank account object
        BankAccount person1BankAccount = new BankAccount(001, 1000, person1);

        //displaying bank account object
        person1BankAccount.display();
        System.out.println(person1BankAccount);

        Person person2 = new Person("jerry", "murphy",
                "Tower", new Meat("Beef", 108, 25, 0.9,
                0.7, 0.07, 0.9));

        //creating loan account object
        LoanAccount loanAccount1 = new LoanAccount(001, 5000, person2, 600);

        //displaying loan account object
        loanAccount1.display();
        System.out.println(loanAccount1);

      //displaying account holders first name and balance in BankAccount object
        System.out.println("first name: " + person1BankAccount.getPerson().getFirstName());
        System.out.println(" balance: " + person1BankAccount.getBalance());

      //editing the overdraft limit by 200
       System.out.println("old overdraft limit: "+ loanAccount1.getOverdraftLimit());
        int newOverdraft = loanAccount1.getOverdraftLimit() + 200;
        loanAccount1.setOverdraftLimit(newOverdraft);
        System.out.println("new overdraft limit: "+ loanAccount1.getOverdraftLimit());

        System.out.println("account number: " + loanAccount1.getAccNum() + " owners last name: "
                + loanAccount1.getPerson().getLastName() + " overdraft limit: " + loanAccount1.getOverdraftLimit());

        System.out.println("End of account testing");

        /* Testing Part 2 of Assignment */

        //Creating an empty HashSet for Person
        HashSet<Person> set = new HashSet<Person>();

        //Using the add() method to add Person elements into the Set
        set.add(person1);
        set.add(person2);

        //using iterator to iterate through set
        Iterator<Person> it = set.iterator();
        System.out.print('[');
        while(it.hasNext()){
            Person person = it.next();
            System.out.println(person.getFirstName() + " " + person.getLastName() + " lives in  " +  person.getAddress()
                    + " and their favourite food is " + person.getFavouriteFood().getName() +
                    ". The fat content in this food is " + person.getFavouriteFood().getFat()
                    + ", the calories are " + person.getFavouriteFood().getKCals() + ", the protein level is "
                    + person.getFavouriteFood().getProtein() + ", the vitamin A, B and C contents are respectively  " +
                    person.getFavouriteFood().getVitaminA() + ", " + person.getFavouriteFood().getVitaminB() + ", " +
                    person.getFavouriteFood().getVitaminC() + ". Is this food healthy?  " + person.getFavouriteFood().healthy());
        }
        System.out.println(']');
    }
}
