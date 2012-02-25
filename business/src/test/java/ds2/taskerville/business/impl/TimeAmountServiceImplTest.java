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

import ds2.taskerville.api.TimeAmount;
import ds2.taskerville.api.remote.TimeAmountDto;
import ds2.taskerville.api.svc.TimeAmountService;
import javax.inject.Inject;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

/**
 * @author kaeto23
 *
 */
@Guice(modules = TestInjectionPlan.class)
public class TimeAmountServiceImplTest {

  /**
   * The time amount service to test.
   */
  @Inject
  private TimeAmountService to;

  /**
   * Test method for
   * {@link ds2.taskerville.business.impl.TimeAmountServiceImpl#createTimeAmount(int, java.lang.Integer, java.lang.Integer, java.lang.Integer)}
   * .
   */
  @Test
  public final void testCreateTimeAmount() {
    TimeAmount ta = to.createTimeAmount(0, null, null, null);
    Assert.assertNotNull(ta);
    Assert.assertEquals(new TimeAmountDto(0, 1, 0, 0), to.createTimeAmount(60,
        null, null, null));
    Assert.assertEquals(new TimeAmountDto(1, 1, 0, 0), to.createTimeAmount(61,
        null, null, null));
    Assert.assertEquals(new TimeAmountDto(0, 1, 1, 0), to.createTimeAmount(0, 9,
        null, null));
    Assert.assertEquals(new TimeAmountDto(0, 0, 1, 1), to.createTimeAmount(0, 0,
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
