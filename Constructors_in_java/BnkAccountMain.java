package Constructors_in_java;

class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposite(double amount) {
        balance += amount;
        System.out.println("Deposited:" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw:" + amount);
        } else {
            System.out.println("Insufficient Balancce!");
        }
    }

    void display() {
        System.out.println("Account Holder:" + accountHolder);
        System.out.println("Balance:" + balance);
    }
}

class BnkAccountMain {
    public static void main(String[] aa) {
        BankAccount ba1 = new BankAccount("Shivani", 5000);
        ba1.display();

        ba1.deposite(1000);
        ba1.withdraw(2000);
        ba1.withdraw(20000);

        ba1.display();
    }
}