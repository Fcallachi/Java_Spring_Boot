package org.generation.blogPessoal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.jupiter.api.Test;

public class Testes {

	@Test
	public void testarString() {
		String obj1="Junut";
		String obj2="Junut";
		assertNotEquals(obj1,obj2);
	}
	@Test
	public void testarInteiros() {
		int obj1=1;
		int obj2=1;
		assertEquals(obj1,obj2);
	}
	@Test
	public void testarNulo() {
		String obj1="teste";
		String obj2="Juynit";
		assertNull(obj1);
	}
	
	@Test
	public void whenAssertingNotSameObject_thenDifferent() {
		Object cat = new Object();
		Object dog = new Object();
		assertNotSame(cat,dog);
	}
	
	@Test
	public void whenAssertingNotSameObject_thenEquals() {
		Object cat = new Object();
		Object dog = new Object();
		assertSame(cat,dog);
	}
}
