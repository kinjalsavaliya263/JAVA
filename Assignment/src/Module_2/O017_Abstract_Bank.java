/*
 * Create an abstract class 'Bank' with an abstract method 'getBalance'. 
	$100, $150 and $200 are deposited in banks A, B and C respectively. 
	'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a 
	method named 'getBalance'. Call this method by creating an object of 
	each of the three classes.
 */
package Module_2;

abstract class Bank {
	public abstract void getBalance();

	int Balance = 0;
}

class BankA extends Bank {
	public void getBalance() {
		Balance = 100;
		System.out.println("Balance of BankA : $" + Balance);
	}
}

class BankB extends Bank {
	public void getBalance() {
		Balance = 150;
		System.out.println("Balance of BankB : $" + Balance);
	}
}

class BankC extends Bank {
	public void getBalance() {
		Balance = 200;
		System.out.println("Balance of BankC : $" + Balance);
	}
}

public class O017_Abstract_Bank {
	public static void main(String[] args) {
		BankA a1 = new BankA();
		a1.getBalance();

		BankB b1 = new BankB();
		b1.getBalance();

		BankC c1 = new BankC();
		c1.getBalance();
	}
}
