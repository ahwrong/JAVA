package com.varxyz.banking.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
	private static CustomerService service = new CustomerServiceImpl();
	private Map<String, Customer> map = new HashMap<String, Customer>();	

	CustomerServiceImpl() {
		super(); // 기본적으로 super, 안 써줘도 가능하지만 써주기.
	}
	
	public static CustomerService getInstance() {
		return service;
	}
	
	public void addCustomer(Customer customer) {
		if(!map.containsKey(customer.getSsn())) {
			map.put(customer.getSsn(), customer);			
		}	
	}

	public Customer getCustomerBySsn(String ssn) {
		if(map.containsKey(ssn)) {
			return map.get(ssn);
		}
		return null;
	}

	public Collection<Customer> getAllCustomers() {		
		return map.values();
	}

	public int getNumOfCustomers() { 
		return map.size();
	}

}

//package com.varxyz.banking.domain;
//
//import java.util.List;
////CustomerServiceImpl  (f2)
//public class CustomerServiceImpl implements CustomerService{
//
//	public void addCustomer(Customer customer) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public void getCustomerBySsn(String ssn) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public List<Customer> getAllCustomers() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public int getNumOfCustomers() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	public 
//}
