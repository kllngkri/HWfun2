public class Account {
    private String accountNumber;
    private double balance;
    private boolean status = true;

    private boolean SUSPEND = false;
    private boolean ACTIVE = true;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;

        if (initialBalance <= 0.)
            throw new IllegalArgumentException("Initial balance must be positive.");
        else
            this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0.)
            throw new IllegalArgumentException("Amount must be positive.");
        else if (!isActive())
            throw new IllegalStateException("Account is suspended");
        else
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0. || amount > balance)
            throw new IllegalArgumentException("Amount must be positive and not exceeding balance.");
        else if (!isActive())
            throw new IllegalStateException("Account is suspended");
        else
            balance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void suspend(){
        this.status = SUSPEND;
    }

    public void reactivate(){
        this.status = ACTIVE;
    }

    public boolean isActive(){
      return status;
    }
}