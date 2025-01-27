package partA.ex01;

public class CheckingAccount {
    public String name;
    public double balance;

    public void deposit(double x) {
        balance += x;
    }

    public void displayCustomer() {
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

}
