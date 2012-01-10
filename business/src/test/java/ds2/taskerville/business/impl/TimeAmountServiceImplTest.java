/**
 *
 */
package ds2.taskerville.business.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;


import ds2.taskerville.api.TimeAmount;
import ds2.taskerville.api.remote.TimeAmountDto;
import ds2.taskerville.api.svc.TimeAmountService;

/**
 * @author kaeto23
 *
 */
public class TimeAmountServiceImplTest {

  /**
   * The time amount service to test.
   */
  private TimeAmountService to = null;

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
    //to = ij.getInstance(TimeAmountService.class);
  }

  /**
   * Test method for
   * {@link ds2.taskerville.business.impl.TimeAmountServiceImpl#createTimeAmount(int, java.lang.Integer, java.lang.Integer, java.lang.Integer)}
   * .
   */
  @Test
  public final void testCreateTimeAmount() {
    TimeAmount ta = to.createTimeAmount(0, null, null, null);
    assertNotNull(ta);
    assertEquals(new TimeAmountDto(0, 1, 0, 0), to.createTimeAmount(60,
        null, null, null));
    assertEquals(new TimeAmountDto(1, 1, 0, 0), to.createTimeAmount(61,
        null, null, null));
    assertEquals(new TimeAmountDto(0, 1, 1, 0), to.createTimeAmount(0, 9,
        null, null));
    assertEquals(new TimeAmountDto(0, 0, 1, 1), to.createTimeAmount(0, 0,
        6, 0));
  }

  /**
   * Test method for
   * {@link ds2.taskerville.business.impl.TimeAmountServiceImpl#parseTimeAmount(java.lang.String)}
   * .
   */
  @Test
  public final void testParseTimeAmount() {
    // fail("Not yet implemented");
  }
}
