package com.iso.ppw.test.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ListFactoryAutowire {
	
	
	private List<String> myList;

	public List<String> getMyList() {
		return myList;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	

}
