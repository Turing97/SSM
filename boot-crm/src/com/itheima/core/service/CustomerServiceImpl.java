package com.itheima.core.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.itheima.common.utils.Page;
import com.itheima.core.dao.CustomerDao;
import com.itheima.core.po.Customer;
//�ͻ�����
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	//����dao���Բ�ע��
	@Autowired
	private CustomerDao customerDao;
	//�ͻ��б�
	public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource,
			String custIndustry, String custLevel) {
		// TODO Auto-generated method stub
		//�����ͻ�����
		Customer customer = new Customer();
		//�жϿͻ�����
		if(StringUtils.isNotBlank(custName)){
			customer.setCust_name(custName);
		}
		//�жϿͻ���Ϣ��Դ
		if(StringUtils.isNoneBlank(custSource)){
			customer.setCust_source(custSource);
		}
		//�жϿͻ�������ҵ
		if(StringUtils.isNoneBlank(custIndustry)){
			customer.setCust_industry(custIndustry);
		}
		//�жϿͻ�����
		if(StringUtils.isNoneBlank(custLevel)){
			customer.setCust_level(custLevel);
		}
		//��ǰҳ
		customer.setStart((page-1)*rows);
		//ÿҳ��
		customer.setRows(rows);
		//��ѯ�ͻ��б�
		List<Customer> customers = customerDao.selectCustomerList(customer);
		//��ѯ�ͻ��б��ܼ�¼��
		Integer count = customerDao.selectCustomerListCount(customer);
		//����page����
		Page<Customer> result = new Page<>();
		result.setPage(page);
		result.setRows(customers);
		result.setSize(rows);
		result.setTotal(count);
		return result;
		
	}
	@Override
	public int createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.createCustomer(customer);
	}
	
	
	 
}
