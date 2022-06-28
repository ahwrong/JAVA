package com.varxyz.jv251.dao;

import java.util.Date;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.CheckingAccount;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.domain.SavingsAccount;

public class AccountDaoTest {
   public static void main(String[] args) {
      AccountDao dao = new AccountDao();
      
      SavingsAccount sa = new SavingsAccount();
      CheckingAccount ca = new CheckingAccount();
      sa.setAccountNum("567-89-0123");
      sa.setBalance(4500.0);
      sa.setInterestRate(0.04);
      sa.setRegDate(new Date());
      sa.setAccountType('S');
      sa.setCustomer(new Customer(1011));
      dao.addAccount(sa);
      for(Account account : dao.findAccountsBySsn("901213-1234567")) {
         System.out.println("=============================");
         System.out.println(account);
         System.out.println("=============================");
      }
      System.out.println("=============================");
      dao.findAllAccounts();
      System.out.println("=============================");
   }
}