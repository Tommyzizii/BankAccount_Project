package BankProject;

public class Main {
    public static void main(String[] args) {
        BankAccount myBank = new BankAccount(10000.00);
        System.out.println("Opening Balance: " + myBank.getBalance());

        myBank.setDeposit(500);
        System.out.println("Depositing: " + myBank.getDeposit());
        myBank.deposit(myBank.getDeposit());
        System.out.println("New Balance: " + myBank.getBalance());

        myBank.setWithdrawal(200);
        System.out.println("Withdrawing: " + myBank.getWithdrawal());
        myBank.withdrawal(myBank.getWithdrawal());
        System.out.println("New Balance: " + myBank.getBalance());
    }
}


