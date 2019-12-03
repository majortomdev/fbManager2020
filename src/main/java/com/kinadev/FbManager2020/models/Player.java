package com.kinadev.FbManager2020.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="pname", nullable= false)
	private String pName;
	
	@Column(name="age", nullable= false)
	private int age;
	
	@Column(name="fposition", nullable= false)
	private String fPosition;
	
	@Column(name="mvalue", nullable= false)
	private int mValue;

	public Long getId() {
		return id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getfPosition() {
		return fPosition;
	}

	public void setfPosition(String fPosition) {
		this.fPosition = fPosition;
	}

	public int getmvalue() {
		return mValue;
	}

	public void setmvalue(int mValue) {
		this.mValue = mValue;
	}
	
	
	
	

}
