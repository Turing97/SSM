package com.itheima.core.service;
//数据字典service接口

import java.util.List;

import com.itheima.core.po.BaseDict;

public interface BaseDictService {
	//根据类别代码查询数据字典
	public List<BaseDict> findBaseDictByTypeCode(String typecode);
	
}
