package partA.ex01;

public class SavingAccountExample { //creates parent class
    public double balance; //creates a double balance accessible to everyone
    public double interestRate = 0.01; //creates a double interestRate accessible to everyone
    public String name; //creates a string name accessible to everyone

    public void deposit(int x) { //creates a class deposit that takes in integer x
        balance += x; //adds x to balance
    } //closes class

    public void displayCustomer() { //creates class displayCustomer
        System.out.println("Customer: "+ name); //prints out customer: name
        System.out.println("Balance: " + balance); //prints balance
        System.out.println("Rate: " + interestRate); //prints interest rate
    } //closes class
} //closes parent class
