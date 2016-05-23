package io.lucci.springwalkthrough.beans;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import io.lucci.springwalkthrough.beans.BusinessLogic;
import io.lucci.springwalkthrough.beans.Counter;

public class BusinessLogicTest {
	
	private BusinessLogic bl;
	private Counter counterMock;

	@Before
	public void setup() throws Exception {
		bl = new BusinessLogic();

		counterMock = mock(Counter.class);
		// manually set the mock. at application runtime the dependecy is managed by the spring container
		bl.setCounter(counterMock);
		// manually call the afterPropertySet, the unit test is not inside a spring context
		bl.afterPropertiesSet();
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
