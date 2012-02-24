/*
 * TaskerVille - issue and project management
 * Copyright (C) 2012  Dirk Strauss
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
