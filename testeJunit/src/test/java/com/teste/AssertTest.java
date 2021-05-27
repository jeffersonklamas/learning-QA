package com.teste;

// Aprendizagem de testes com JUnit 5.

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class AssertTest {
	
	 @Test
	 public void meuPrimeiroTeste() {
	        assertEquals(2, 3 + 1);
	    }
	
	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "teste".getBytes();
		byte[] current = "teste".getBytes();
		assertArrayEquals(expected, current);
	}
	
	@Test
	public void testAssertEquals() {
		assertEquals("text", "text");
	}
	
	@Test
	public void testAssertFalse() {
		assertFalse(false);
	}
	
	@Test
	public void testAssertNotNull() {
		assertNotNull(new Object());
	}
	@Test
	public void testAssertNotSame() {
		assertNotSame(new Object(), new Object());
	}
	
	@Test
	public void testAssertNull() {
		assertNull(null);
	}
	
	@Test
	public void testAssertSame() {
		Integer aNumber = Integer.valueOf(768);
		assertSame(aNumber, aNumber);
	}	
}
