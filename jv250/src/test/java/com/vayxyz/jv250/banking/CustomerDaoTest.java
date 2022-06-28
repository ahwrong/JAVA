package com.vayxyz.jv250.banking;

import java.util.List;

import banking.Customer;
import banking.CustomerDao;

public class CustomerDaoTest {
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		
		//findAllcustomers() Test
		List<Customer> customerList = dao.findAllCustomers();
		for(Customer customer : customerList) {
			System.out.println(customer);
		}
		System.out.println("-------------------------------");
		
		//findCustomerBySsn
		Customer customer = dao.findCustomerBySsn("920812-1234586");
		System.out.println(customer);
		System.out.println("-------------------------------");
		
		//addCustomer
		Customer c = new Customer();
		c.setName("°ø¸í");
		c.setSsn("920812-1234586");
		c.setPhone("010-2323-2323");
		c.setPassword("1111");
		c.setCustomerID("java");
		dao.addCustomer(c);
	}
}
