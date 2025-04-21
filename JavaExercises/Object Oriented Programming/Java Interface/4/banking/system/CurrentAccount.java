package banking.system;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double initialDeposit) {
        this.balance = initialDeposit;
    }

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
}
