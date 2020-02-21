package com.accp.t4.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class Person {

	private String pid;
	private String pname;
	private String name;
	private String cname;
	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}

	private String phone;
	@JSONField(format = "yyyy-MM-dd")
	private Date pdate;
	private String pimg;// 图片服务器文件名
	private String pimgdata;// base64数据
	private List<Address> addresses = new ArrayList<Address>(0);

	public Person(String pid, String pname, String phone,String name,String cname, Date pdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.name = name;
		this.cname = cname;
		this.phone = phone;
		this.pdate = pdate;
	}

	

	public String getPimgdata() {
		return pimgdata;
	}

	public void setPimgdata(String pimgdata) {
		this.pimgdata = pimgdata;
	}

	public Person() {
		super();
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public String getPimg() {
		return pimg;
	}

	public void setPimg(String pimg) {
		this.pimg = pimg;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
