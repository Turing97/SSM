package com.itheima.core.dao;

import java.util.List;

import com.itheima.core.po.Customer;


//customer�ӿ�
public interface CustomerDao {
	//�ͻ��б�
	public List<Customer> selectCustomerList(Customer customer);
	//�ͻ���
	public Integer selectCustomerListCount(Customer customer);
	//�����ͻ�
	public int createCustomer(Customer customer);
}
