package com.varxyz.banking.domain;

public class CustomerServiceTest {
	public static void main(String[] args) {
		CustomerService customer = new CustomerServiceImpl();
		customer.addCustomer(new Customer());
		customer.addCustomer(new Customer());
		
		customer.getCustomerBySsn("1234-5678");
		System.out.println(customer.getNumOfCustomers());
		System.out.println(customer.getCustomerBySsn("1234-5678"));
		System.out.println(customer);
	}
}
