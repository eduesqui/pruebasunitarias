package com.eduesqui.pruebasunitarias.pojos;

import java.util.Date;

public class DolarPojo {
	
	Double dolarValue;
	Date date;
	
	public DolarPojo() {
		super();
		
	}
	
	public DolarPojo(Double dolarValue, Date date) {
		super();
		this.dolarValue = dolarValue;
		this.date = date;
	}
	
	public Double getDolarValue() {
		return dolarValue;
	}
	
	public void setDolarValue(Double dolarValue) {
		this.dolarValue = dolarValue;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	

}
