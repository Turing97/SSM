package com.itheima.core.service;

import com.itheima.core.po.User;

//�û�service�ӿ�
public interface UserService {
	//ͨ���˺������ѯ�û�
	
	public User findUser(String usercode,String password);
}
