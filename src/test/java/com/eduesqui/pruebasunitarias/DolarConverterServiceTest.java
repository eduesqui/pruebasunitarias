package com.eduesqui.pruebasunitarias;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.eduesqui.pruebasunitarias.pojos.DolarPojo;
import com.eduesqui.pruebasunitarias.service.DolarConverterService;
import com.eduesqui.pruebasunitarias.service.DolarService;

class DolarConverterServiceTest {

	@Test
	void result_one_when_value_is_equals_dolar() {
		DolarService dolarService = Mockito.mock(DolarService.class);	
		Mockito.when(dolarService.getDolarValue(DivisasEnum.MXN)).thenReturn(new DolarPojo(19.3,new Date()));
		DolarConverterService dolarConverterService = new DolarConverterService();
	
		assertEquals(1.0, dolarConverterService.covertToDolar(dolarService.getDolarValue(DivisasEnum.MXN),19.3).doubleValue());
	}
	
	@Test
	void result_is_the_value_of_dolar_divided_value() {
		DolarService dolarService = Mockito.mock(DolarService.class);	
		Mockito.when(dolarService.getDolarValue(DivisasEnum.MXN)).thenReturn(new DolarPojo(20.00,new Date()));
		DolarConverterService dolarConverterService = new DolarConverterService();
	
		assertEquals(2.0, dolarConverterService.covertToDolar(dolarService.getDolarValue(DivisasEnum.MXN),40.0).doubleValue());
	}

}
