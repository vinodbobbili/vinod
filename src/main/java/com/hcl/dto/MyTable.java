package com.hcl.dto;

public class MyTable {
	@Override
	public String toString() {
		return "MyTable [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

	String id, name, phone,address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
