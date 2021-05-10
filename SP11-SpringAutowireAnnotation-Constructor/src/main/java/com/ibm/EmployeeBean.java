package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {
	private String fullName;
	private DepertmentBean depertmentBean;

	@Autowired
	public EmployeeBean(DepertmentBean depertmentBean) {
		this.depertmentBean = depertmentBean;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public DepertmentBean getDepertmentBean() {
		return depertmentBean;
	}

	public void setDepertmentBean(DepertmentBean depertmentBean) {
		this.depertmentBean = depertmentBean;
	}

	@Override
	public String toString() {
		return "EmployeeBean [fullName=" + fullName + ", depertmentBean=" + depertmentBean + "]";
	}

}
