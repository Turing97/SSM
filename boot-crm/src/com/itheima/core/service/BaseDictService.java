package com.itheima.core.service;
//�����ֵ�service�ӿ�

import java.util.List;

import com.itheima.core.po.BaseDict;

public interface BaseDictService {
	//�����������ѯ�����ֵ�
	public List<BaseDict> findBaseDictByTypeCode(String typecode);
	
}
