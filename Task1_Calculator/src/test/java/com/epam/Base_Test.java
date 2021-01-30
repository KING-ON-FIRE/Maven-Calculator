package com.epam;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class Base_Test {
	@Test
	public void ShouldAdd() {
		Calculator cal = new Calculator();
		
		int res = cal.add(10, 15);
		assertThat(res).isEqualTo(25);
		
	}
	
	@Test
	public void ShouldSubtract() {
		Calculator cal = new Calculator();
		
		int res = cal.subtract(25,5);
		assertThat(res).isEqualTo(25-5);
		
	}

	@Test
	public void ShouldMultiply() {
		Calculator cal = new Calculator();
		int res = cal.multiply(10,15);
		assertThat(res).isEqualTo(10*15);
	}
	
	@Test
	public void ShouldDivide() {
		Calculator cal = new Calculator();
		int res = cal.divide(25, 5);
		assertThat(res).isEqualTo(25/5);
	}
}