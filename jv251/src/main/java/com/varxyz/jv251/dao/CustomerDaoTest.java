package com.varxyz.jv251.dao;
import java.util.List;

import com.varxyz.jv251.domain.Customer;

public class CustomerDaoTest {
   public static void main(String[] args) {
      CustomerDao dao = new CustomerDao();
      List<Customer> customerList = dao.findAllCustomers();
      
      //findAllCustomers() Test
      for(Customer customer : customerList) {
         System.out.println(customer);
      }
      
      //find
      Customer customer = dao.findCustomerBySsn("970824-1234567");
      System.out.println("================================");
      System.out.println(customer);
      System.out.println("================================");
      
      Customer c = new Customer();
      c.setName("공명");
      c.setSsn("970824-1234567");
      c.setPhone("010-5656-5656");
      c.setUserId("pertygong");
      c.setPasswd("1111");
      dao.addCustomer(c);
   }
}