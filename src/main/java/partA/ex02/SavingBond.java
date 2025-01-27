package partA.ex02;

import java.util.Scanner;

public class SavingBond {
    public String name;
    public double balance, interestRate;
    public int term, monthsRemaining;

    public void setBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much would you like to deposit into your account?");
        System.out.println("Type below here: ");
        balance = scanner.nextInt();
        System.out.println();
    }

    public void setTermAndRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which bond would you like to purchase?");
        System.out.println("0-11 months: 0.5%");
        System.out.println("12-23 months: 1.0%");
        System.out.println("24-35 months: 1.5%");
        System.out.println("36-47 months: 2.0%");
        System.out.println("48-60 months: 2.5%");
        System.out.println("Type below how many months you would like to purchase:");
        term = scanner.nextInt();
        String percent = "";

        if (term >= 0 && term < 12) {
            interestRate = 0.005;
            percent = "0.5%";
        } else if (term >= 12 && term < 24) {
            interestRate = 0.010;
            percent = "1.0%";
        } else if (term >= 24 && term < 36) {
            interestRate = 0.015;
            percent = "1.5%";
        } else if (term >= 36 && term < 48) {
            interestRate = 0.020;
            percent = "2.0%";
        } else if (term >= 48 && term <= 60) {
            interestRate = 0.025;
            percent = "2.5%";
        } else {
            System.out.println("Invalid number");
        }

        monthsRemaining = term;
        System.out.println("You've purchased a " + monthsRemaining + " month long plan at " + percent + " interest rate.");
    }

    public void earnInterest() {
        if (monthsRemaining > 0) {
            balance += balance * interestRate / 12;
            monthsRemaining--;
            System.out.println();
            System.out.println("Your updated balance: ");
            System.out.println("Balance: $" + balance);
            System.out.println("Rate: " + interestRate);
            System.out.println("Months Remaining: " + monthsRemaining);
        }
    }

    public void finalBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Would you like to see what your updated balance would look if unchanged?");
        System.out.println("(1) Yes");
        System.out.println("(2) No");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Your balance across the months at a " + interestRate + " interest rate will be: ");
            for (int i = 1; i <= monthsRemaining + 1; i++) {
                System.out.println("Month " + i + " balance: " + (balance += balance * interestRate / 12));
            }
        } else if (choice == 2) {
            System.out.println("Okay, thank you for banking with us! Goodbye!");
        }

    }
}
