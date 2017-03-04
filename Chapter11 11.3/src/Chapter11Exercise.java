import java.util.ArrayList;
import java.util.Date;
public class Chapter11Exercise {

	public static void main(String[] args) {
		Account account = new Account(111, 200);
        CheckingAccount checkingAccount = new CheckingAccount(112, 250);
        SavingsAccount savingsAccount = new SavingsAccount(113, 300);

        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);

	}

}
class Account {

    protected String name;
    protected int Id;
    protected double balance;
    protected double annualInterestRate; // AnnualInterestRate is percentage.
    protected Date dateCreated;
    
    
    public Account() {
        dateCreated = new Date();
    }

    public void withdraw(double amount) {
	
		
	}

	public Account(int id, double balance) {
        this();
        Id = id;
        balance = balance;
    }

    public Account(String name, int id, double balance) {
        this(id, balance);
        name = name;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return balance * (annualInterestRate / 12) / 100;
    }



    @Override
    public String toString() {
        return "Account";
    }

    

}
class CheckingAccount extends Account {

    protected double Overdrft_Limit = -37;

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw (double amount) {
        if (balance - amount >= Overdrft_Limit) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + "balance=" + balance + '}';
    }
}
class SavingsAccount extends Account {

    protected double Overdraft_Limit = 0;

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= Overdraft_Limit) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + balance +
                '}';
    }
}
