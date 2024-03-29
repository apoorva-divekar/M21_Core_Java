package com.cg.client;

import com.cg.app.MMBankFactory;
import com.cg.app.MMCurrentAcc;
import com.cg.app.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		MMBankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(123," Apoorva ",600000,true);
		CurrentAcc c = new MMCurrentAcc(345," APOORVA ",200000,60000);
		
		System.out.println("Saving Account");
		System.out.println("Balance of Saving Account is:"+s.getAccBal());
		System.out.println(s);
		System.out.println();
		System.out.println("Current Account");
		System.out.println("Balance of Current Account is:"+c.getAccBal());
		c.withdraw(60000);
		System.out.println(c);
	}
}