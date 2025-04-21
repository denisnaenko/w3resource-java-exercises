package banking.system;

public interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    default double calculateInterest(double amount, double days) {
        return 0;
    };
}
