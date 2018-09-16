package employeeinfo;

public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	public AccountType acctType;
	private Employee employee;

	public Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	public Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return  "\nAccount type: " + acctType + "\n Current bal: " + balance;
	}

	public void makeDeposit(double deposit) {	
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		
		if(amount <= balance) {
			balance -= amount;
			return true;
		}
		
		return false;
	}
}
