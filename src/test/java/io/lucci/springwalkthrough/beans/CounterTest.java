/**
 * 
 */
package io.lucci.springwalkthrough.beans;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import io.lucci.springwalkthrough.beans.Counter;

public class CounterTest {
	
	private Counter counter;


	@Before
	public void setUp() {
		counter = new Counter();
	}

	@Test
	public void testPlusOne() throws Exception {
		assertThat(counter.plusOne().get(), is(1));
	}

	@Test
	public void testMinusOne() throws Exception {
		assertThat(counter.minusOne().get(), is(-1));
	}

}
