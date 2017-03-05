import java.util.ArrayList;
import java.util.Date;
public class Chapter11Exercise {

	public static void main(String[] args) {
		Account account = new Account("George", 197, 600);
        CheckingAccount checkingAccount = new CheckingAccount(150, 850);
        SavingsAccount savingsAccount = new SavingsAccount(100, 700);

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
        dateCreated = new java.util.Date();
    }

    public void withdraw(double amount) {
    	balance -= amount;

	}

	

    public Account(String name, int id, double balance) {
        this.Id = id;
        this.name = name;
        this.balance = balance;

    }

    public int getId() {
        return this.Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public double getBalance() {
        return this.balance;
    }
    public String getName(){
    	return this.name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public  double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return balance * (annualInterestRate / 1200); 
    }



    @Override
    public String toString() {
        return "Account";
    }

    

}
class CheckingAccount extends Account {

    protected double Overdrft_Limit = -37;

    public CheckingAccount(int id, double balance) {
        super();
    }

    @Override
    public void withdraw (double amount) {
        if (balance - amount >= Overdrft_Limit) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + " balance = " + balance + '}';
    }
}
class SavingsAccount extends Account {

    protected double Overdraft_Limit = 0;

    public SavingsAccount(int id, double balance) {
        super();
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= Overdraft_Limit) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount{" + "balance=" + balance + '}';
    }
}
