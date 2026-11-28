//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 6
//Task 6.4: BankAccount. Implement BankAccount. In main, deposit, withdraw and attempt an overdraft, printing the account after each step.


public class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
        } else if (amount > balance) {
            System.out.println("Insufficient funds! Overdraft not allowed.");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account [" + accountNumber + ", Owner: " + owner + ", Balance: " + balance + "]";
    }
}
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("001", "Edi", 800);
        System.out.println(acc);

        acc.deposit(400);
        System.out.println("After deposit: " + acc);

        acc.withdraw(300);
        System.out.println("After withdrawal: " + acc);

        acc.withdraw(1000);
        System.out.println("After overdraft attempt: " + acc);
    }
}