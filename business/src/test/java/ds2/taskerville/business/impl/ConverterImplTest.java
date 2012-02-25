/**
 * 
 */
package ds2.taskerville.business.impl;

import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import com.google.inject.Inject;

import ds2.taskerville.api.util.ConverterService;

/**
 * @author kaeto23
 * 
 */
@Guice(modules = TestInjectionPlan.class)
public class ConverterImplTest {
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
