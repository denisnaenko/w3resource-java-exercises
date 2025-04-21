package banking.system;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount implements Account {
    private double balance;
    private final double interestRate;

    public SavingsAccount(double initialDeposit, double interestRate) {
        this.balance = initialDeposit;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("The amount to withdraw must not exceed your current balance");
        }
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return new BigDecimal(balance).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public double calculateInterest(double amount, double days) {
        return amount * interestRate * (days / 365);
    }
}
