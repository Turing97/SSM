package com.itheima.core.po;

import java.io.Serializable;

//�����ֵ�־û���
public class BaseDict implements Serializable {
	private static final long serialVersionUID = 1L;
	private String dict_id;								//�����ֵ�id
	private String dict_type_code;						//�����ֵ�������
	private String dict_type_name;						//�����ֵ��������
	private String dict_item_name;						//�����ֵ���Ŀ����
	private String dict_item_code;						//�����ֵ���Ŀ����
	private Integer dict_sort;							//�����ֶ�
	private String dict_enable;							//�Ƿ����
	private String dict_momo;							//��ע��
	public String getDict_id() {
		return dict_id;
	}
	public void setDict_id(String dict_id) {
		this.dict_id = dict_id;
	}
	public String getDict_type_code() {
		return dict_type_code;
	}
	public void setDict_type_code(String dict_type_code) {
		this.dict_type_code = dict_type_code;
	}
	public String getDict_type_name() {
		return dict_type_name;
	}
	public void setDict_type_name(String dict_type_name) {
		this.dict_type_name = dict_type_name;
	}
	public String getDict_item_name() {
		return dict_item_name;
	}
	public void setDict_item_name(String dict_item_name) {
		this.dict_item_name = dict_item_name;
	}
	public String getDict_item_code() {
		return dict_item_code;
	}
	public void setDict_item_code(String dict_item_code) {
		this.dict_item_code = dict_item_code;
	}
	public Integer getDict_sort() {
		return dict_sort;
	}
	public void setDict_sort(Integer dict_sort) {
		this.dict_sort = dict_sort;
	}
	public String getDict_enable() {
		return dict_enable;
	}
	public void setDict_enable(String dict_enable) {
		this.dict_enable = dict_enable;
	}
	public String getDict_momo() {
		return dict_momo;
	}
	public void setDict_momo(String dict_momo) {
		this.dict_momo = dict_momo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
