
package com;

import org.springframework.stereotype.Component;

@Component("saving")
public class SavingAccount implements Bank {

	public void getBalance() {
		System.out.println("Saving account balance......");
	}
}
