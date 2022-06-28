package com.varxyz.banking.domain;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccoutService {
	private static AccoutService service = new AccountServiceImpl();
	private List<Account> accountList = new ArrayList<Account>();
	private CustomerService customerService;
	
	private AccountServiceImpl() {
		customerService = CustomerServiceImpl.getInstance();
	}
	
	public static AccoutService getInstance() {
		return service;
	}
	
	public Account createSavingsAccount(String accountNum, double balance, double interestRate) {
		return new SavingsAccount(accountNum, balance, interestRate);
	}
	
	public Account createCheckingAccount(String accountNum, double balance, double overdraftAmount) {
		return new CheckingAccount(accountNum, balance, overdraftAmount);
	}
	
	/**
	 * �ű� ���� ���
	 * @param account ���������� ������ ��ü�� ĸ��ȭ
	 */
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	
	/**
	 * ���޵� ssn�� ���� ���� ��ȸ�� �� �ű� ���� ���
	 * @param account
	 * @param ssn
	 */
	public void addAccount(Account account, String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn); //�ֹι�ȣ�� ���� ��
		account.setCustomer(customer); //���� �����
	}
	
	public List<Account> getAccountBySsn(String ssn) { // �ֹι�ȣ�� �ش��ϴ� ���� ����
		return null;
	}
	
	public Account getAccountByAccountNum(String accountNum) {
		for(Account a : accountList) {
			if(accountNum.equals(a.getAccountNum())) {
				return a;
			}
		}
		return null;	
	}

}

//1.customer���� ���� ã��(���� �������� ã��)
//2.account���� customer�� ������ ����
//* select�� �ϴ� ���� ���� �߿���

// CustomerService 26��° ����
//public Customer getCustomerBySsn(String ssn) {
//	for(Customer c : customerList) {
//		if(ssn.equals(c.getSsn())) {
//			return c;
//		}
//	}
//	return null;	
//}

// �ϳ��� �ϳ��� ������ �ڵ� ���캸��