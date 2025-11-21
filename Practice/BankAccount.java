public class BankAccount {
    private String accountNo;
    private double balance;
    public BankAccount(String accNo, double initialAmount) {
        this.accountNo = accNo;
        this.balance = initialAmount;
    }

    public String getAccountNo() {
        return this.accountNo;
    }
    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposit: " + amount);
        } else {
            System.out.println("Deposit should positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal failed");
        }
    }

    public void showDetails() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount("9876543210", 1500.0);
         myAcc.showDetails();
        myAcc.deposit(300.0);
         myAcc.withdraw(200.0);
         myAcc.withdraw(2000.0);
        myAcc.showDetails();
    }
}