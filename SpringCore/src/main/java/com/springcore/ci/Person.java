package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private certi certi;
	private List<String>list;
	
	public Person(String name, int personId, com.springcore.ci.certi certi,List list) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.list=list;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " : " + this.personId + " : { " + this.certi.name + " } " +list;
	}
	
	
	

}
