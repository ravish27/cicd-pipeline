package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.CalculatorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {

	@Test
	public void testAdd() {
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.add(7, 7), "14");
	}
	
	@Test
	public void testSub() {
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.sub(7, 7), "0");
	}
	
	@Test
	public void testMul() {
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.mul(7, 7), "49");
	}
	
	@Test
	public void testDiv() {
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.div(7, 7), "1");
	}
	
	@Test
	public void testSqr() {
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.sqr(7), "49");
	}

}
