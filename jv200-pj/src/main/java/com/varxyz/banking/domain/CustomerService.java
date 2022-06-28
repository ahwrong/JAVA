package com.varxyz.banking.domain;
import java.util.Collection;
import java.util.List;

/* 1. �ֿ� �޼ҵ�
 * .addCustomer() : �ű� ���߰�
 * .getCustomerBySsn : �ֹι�ȣ�� �� ��ȸ
 * .getAllCustomers(): ��ü �� ���
 * .getNumOfCustomers(): ��ü �� ��
 * 
 * 2. ��Ÿ
 * CustomerService�� ���� ������ ������ �� �ִ� �Ӽ� ����
 * ���� ������ ������ �� �ִ� �Ӽ��� �����϶�.
 */

public interface CustomerService {
	void addCustomer(Customer customer);
	Customer getCustomerBySsn(String ssn);
	Collection<Customer> getAllCustomers();
	int getNumOfCustomers();
//	List<Customer> getAllCustomers();
}

// Account, Customer = domain
// Account > Customer
// �������� 

// domain �ؼ�