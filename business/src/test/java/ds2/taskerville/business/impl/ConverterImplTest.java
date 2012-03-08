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
package ds2.taskerville.business.impl;

import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import com.google.inject.Inject;

import ds2.taskerville.api.util.ConverterService;

/**
 * Simple converter tests.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Guice(modules = TestInjectionPlan.class)
public class ConverterImplTest {
    /**
     * The test object.
     */
    @Inject
    private ConverterService to;
    
    /**
     * Test method for
     * {@link ds2.taskerville.business.impl.ConverterImpl#toInt(java.lang.String, int)}
     * .
     */
    @Test
    public final void testToInt() {
        Assert.assertEquals(to.toInt(null, 0), 0);
        Assert.assertEquals(to.toInt("", 1), 1);
        Assert.assertEquals(to.toInt("abc", 1), 1);
        Assert.assertEquals(to.toInt("23", 1), 23);
    }
    
}
