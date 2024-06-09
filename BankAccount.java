package BankProject;

public class BankAccount {
    private double balance;
    private double depositAmount;
    private double withdrawalAmount;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void setDeposit(double amount) {
        this.depositAmount = amount;
    }

    public double getDeposit() {
        return depositAmount;
    }

    public void withdrawal(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                this.balance -= amount;
            } else {
                System.out.println("You have insufficient balance!!!");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void setWithdrawal(double amount) {
        this.withdrawalAmount = amount;
    }

    public double getWithdrawal() {
        return withdrawalAmount;
    }
}
