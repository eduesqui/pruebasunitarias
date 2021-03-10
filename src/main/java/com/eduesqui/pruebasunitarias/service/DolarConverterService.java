package com.eduesqui.pruebasunitarias.service;

import com.eduesqui.pruebasunitarias.pojos.DolarPojo;

public class DolarConverterService {
	
	public Double covertToDolar(DolarPojo dolar,Double value) {
		//40MXN/20
		return value/dolar.getDolarValue();
	}

}
