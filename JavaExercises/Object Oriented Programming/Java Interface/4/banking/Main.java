package banking;

import banking.system.Account;
import banking.system.Bank;
import banking.system.CurrentAccount;
import banking.system.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Bank yellowBank = new Bank();

        Account user1Savings = new SavingsAccount(10250, 0.14);
        yellowBank.addAccount(user1Savings);

        user1Savings.deposit(1000000);
        System.out.println("user1Savings balance after deposit: " + user1Savings.getBalance());
        user1Savings.withdraw(94534.2442);
        System.out.println("user1Savings balance after withdraw: " + user1Savings.getBalance());

        System.out.println();

        Account user1Current = new CurrentAccount(555);
        yellowBank.addAccount(user1Current);

        user1Current.deposit(95000);
        System.out.println("user1Current balance after deposit: " + user1Current.getBalance());
        user1Current.withdraw(94534.2442);
        System.out.println("user1Current balance after withdraw: " + user1Current.getBalance());
    }
}
