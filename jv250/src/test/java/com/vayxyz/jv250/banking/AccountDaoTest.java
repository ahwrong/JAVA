package com.vayxyz.jv250.banking;

import java.util.Date;
import java.util.Iterator;

import banking.Account;
import banking.AccountDao;
import banking.Customer;
import banking.SavingsAccount;

public class AccountDaoTest {
	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		
		SavingsAccount sa = new SavingsAccount();
		sa.setAccountNum("567-89-0123");
		sa.setBalance(4500.0);
		sa.setCustomer(new Customer(1025));
		sa.setInterestRate(0.04);
		sa.setRegDate(new Date());
		sa.setAccountType('S');
		
		dao.addAccount(sa);
		for(Account account : dao.findAccountsBySsn("901213-1234567")) {
			System.out.println(account);
		}
	}
}
