package com.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	@Test
	void testSomar() {
		calculadora calc = new calculadora();
		int soma = calc.somar("6+1+3");
		assertEquals(5, soma);
	}

}
