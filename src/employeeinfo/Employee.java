package employeeinfo;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
	}

	
	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);	
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {
		// implement
		String formattedAccountInfo = String.format("%nACCOUNT INFO FOR %s: %n", name);
		
		if(checkingAcct != null) {
			formattedAccountInfo += checkingAcct.toString();
		}
		
		if(savingsAcct != null) {
			formattedAccountInfo += savingsAcct.toString();
		}
		
		if(retirementAcct != null) {
			formattedAccountInfo += retirementAcct.toString();
		}
		
				
		return formattedAccountInfo;
	}
	public void deposit(String acctType, double amt){
		// implement
		if(checkingAcct.acctType.equals(acctType)) {
			checkingAcct.makeDeposit(amt);
		}
		
		else if(savingsAcct.acctType.equals(acctType)) {
			savingsAcct.makeDeposit(amt);
		}
		
		else if(retirementAcct.acctType.equals(acctType)) {
			retirementAcct.makeDeposit(amt);
		}
		
	}
	public boolean withdraw(String acctType, double amt){
		// implement
		if(acctType.equals(AccountType.CHECKING)) {
			return checkingAcct.makeWithdrawal(amt);
		}
		
		if(acctType.equals(AccountType.SAVINGS)) {
			return savingsAcct.makeWithdrawal(amt);
		}
		
		if(acctType.equals(AccountType.RETIREMENT)) {
			return retirementAcct.makeWithdrawal(amt);
		}
		
		return false;
	}


	public String getName() {
		return name;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}
	
	

}
