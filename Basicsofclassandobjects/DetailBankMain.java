//  Write a Java program to demonstrate encapsulation by creating a class BankAccount1 
// with private attributes for accountNumber and balance, and public methods to deposit 
// and withdraw money. 

package Basicsofclassandobjects;

class BankAccount1 {
    private String accountNumber1;
    private double balance;

    BankAccount1(String accountNumber1, double balance) {
        this.accountNumber1 = accountNumber1;
        this.balance = balance;
    }

    public void deposited(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount:" + amount);
        } else {
            System.out.println("Invalid deposite!");
        }
    }

    public void withdraw1(double amount) {
        if (amount <= balance) {
            balance += amount;
            System.out.println("Withdraw amount:" + amount);
        } else {
            System.out.println("Invalid withdraw!");
        }
    }

    public void displayDetails() {
        System.out.println("Account number:" + accountNumber1);
        System.out.println("Balance :" + balance);
    }
}

class DetailBankMain {
    public static void main(String XYZ[]) {
        BankAccount1 ba1 = new BankAccount1("123456789", 20000);
        ba1.displayDetails();

        ba1.deposited(3000);
        ba1.withdraw1(100000);

        ba1.displayDetails();
    }
}