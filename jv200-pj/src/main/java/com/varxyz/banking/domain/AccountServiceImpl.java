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
	 * 신규 계좌 등록
	 * @param account 계좌정보와 고객정보 전체를 캡슐화
	 */
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	
	/**
	 * 전달된 ssn을 통해 고객을 조회한 후 신규 계좌 등록
	 * @param account
	 * @param ssn
	 */
	public void addAccount(Account account, String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn); //주민번호를 가진 고객
		account.setCustomer(customer); //계좌 만들기
	}
	
	public List<Account> getAccountBySsn(String ssn) { // 주민번호에 해당하는 계좌 정보
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

//1.customer에서 정보 찾기(적은 정보에서 찾기)
//2.account에는 customer에 정보가 있음
//* select를 하는 곳에 따라 중요함

// CustomerService 26번째 참고
//public Customer getCustomerBySsn(String ssn) {
//	for(Customer c : customerList) {
//		if(ssn.equals(c.getSsn())) {
//			return c;
//		}
//	}
//	return null;	
//}

// 하나씩 하나씩 꺼내서 코드 살펴보기