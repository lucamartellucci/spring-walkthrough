package com.absontheweb.springcore.beans;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class BusinessLogicTest {
	
	private BusinessLogic bl;
	private Counter counterMock;

	@Before
	public void setup() {
		bl = new BusinessLogic();

		counterMock = mock(Counter.class);
		bl.setCounter(counterMock);
	}

	@Test
	public void testDoVeryImportantBusinessLogic() throws Exception {
		// program mock
		when(counterMock.plusOne()).thenReturn(counterMock);
		when(counterMock.get()).thenReturn(100);
		
		// execute the method under test
		int result = bl.doVeryImportantBusinessLogic();
		
		// assertions
		assertThat(result,is(100));
		
		// verify mock invocation
		verify(counterMock,times(3)).plusOne();
		verify(counterMock).get();
	}

}
