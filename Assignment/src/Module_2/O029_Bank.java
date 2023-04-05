/*
 * W.A.J.Pto create a custom exception if Customer withdraw amount which 
	is greater than account balance then program will show custom exception 
	otherwise amount will deduct from account balance.
	Account balance is: 2000 Enter withdraw amount: 2500
	Sorry, insufficient balance, you need more 500 Rs. To perform this 
	transaction.

 */

package Module_2;

class BankOpraion {
	double balance;

	public void getBalance() {
		System.out.println("Current balance is : " + balance);
	}

	public void credit(double amt) {
		balance = balance + amt;
	}

	public void debit(double amt) throws Exception {
		double e = amt - balance;
		if (balance < amt) {
			System.out.println("Sorry insufficient balance, you need more " + e + " Rs. To perform this transaction");
			throw new java.lang.Exception();
		} else {
			balance = balance - amt;
		}
	}
}

public class O029_Bank {
	public static void main(String[] args) {
		BankOpraion op = new BankOpraion();
		op.getBalance();
//		op.credit(5000);
		op.credit(2000);

		op.getBalance();

		try {
			op.debit(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		op.getBalance();
	}
}
