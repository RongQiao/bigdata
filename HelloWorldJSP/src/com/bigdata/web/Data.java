package com.bigdata.web;

public class Data {
	private String name;
	private String firstname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@Override
	public String toString() {
		return "Data [name=" + name + ", firstname=" + firstname
				+ ", getName()=" + getName() + ", getFirstname()="
				+ getFirstname() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
