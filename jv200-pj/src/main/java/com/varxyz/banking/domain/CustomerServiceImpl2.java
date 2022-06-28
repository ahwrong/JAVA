package com.varxyz.banking.domain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerServiceImpl2 implements CustomerService{
	private List<Customer> customerList = new ArrayList<Customer>();

	private Customer isExist(Customer customer) {
		for(Customer c : customerList) {
			if(customer.getSsn().equals(c.getSsn())) {
				return c;
			}
		}
		return null;		
	}

	public void addCustomer(Customer customer) {
		if(getCustomerBySsn(customer.getSsn()) == null ) {
			customerList.add(customer);
		}
	}

	public Customer getCustomerBySsn(String ssn) {
		for(Customer c : customerList) {
			if(ssn.equals(c.getSsn())) {
				return c;
			}
		}
		return null;	
	}

	public Collection<Customer> getAllCustomers() {
		return customerList;
	}

	public int getNumOfCustomers() {		
		return customerList.size();
	}
}

//package com.varxyz.banking.domain;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.varxyz.banking.domain.*;
////list ¹æ¹ý
//public class CustomerServiceImpl2 implements CusomerService{
//	private List<Customer> customerList = new ArrayList<>();
//
//	@Override
//	public void addCustomer(Customer customer) {
//		if(getCustomerBySsn(customer.getSsn()) == null) {
//		}
//	}
//
//	@Override
//	public Customer getCustomerBySsn(String ssn) {
//		for(Customer c : customerList) {
//			if(ssn.equals(c.getSsn())) {
//				return c;
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public Collection<Customer> getAllCustomers() {
//		return customerList;
//	}
//
//	@Override
//	public int getNumOfCustomers() {
//		return customerList.size();
//	}
//}
//
////private boolean isExist(Customer) {
////	for(Customer c : customerList) {
////		if(customer.getSsn().equals(c.getSsn())) {
////			return c;
////		}
////	}
////	return null;
////}