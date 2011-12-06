/**
 * 
 */
package ds2.taskerville.business.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author kaeto23
 * 
 */
public class ConverterImplTest {
	private ConverterImpl to = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		to = new ConverterImpl();
	}

	/**
	 * Test method for
	 * {@link ds2.taskerville.business.impl.ConverterImpl#toInt(java.lang.String, int)}
	 * .
	 */
	@Test
	public final void testToInt() {
		assertEquals(0, to.toInt(null, 0));
		assertEquals(1, to.toInt("", 1));
		assertEquals(1, to.toInt("abc", 1));
		assertEquals(23, to.toInt("23", 1));
	}

}
