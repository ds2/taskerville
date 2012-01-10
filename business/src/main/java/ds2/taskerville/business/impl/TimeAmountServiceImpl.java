package ds2.taskerville.business.impl;

import java.util.logging.Logger;


import ds2.taskerville.api.TimeAmount;
import ds2.taskerville.api.TimeAmountPrefs;
import ds2.taskerville.api.remote.TimeAmountDto;
import ds2.taskerville.api.svc.TimeAmountService;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * The base implemenation of the timeamount service.
 *
 * @author kaeto23
 * @version 1.0
 */
@Singleton
public class TimeAmountServiceImpl implements TimeAmountService {

  /**
   * Some preferences.
   */
  @Inject
  private TimeAmountPrefs prefs;
  /**
   * A logger.
   */
  private static final Logger log = Logger.getLogger(TimeAmountServiceImpl.class.getName());

  /**
   * {@inheritDoc}
   */
  @Override
  public TimeAmount createTimeAmount(int minutes, Integer hours,
      Integer days, Integer weeks) {
    if (hours == null) {
      hours = 0;
    }
    if (days == null) {
      days = 0;
    }
    if (weeks == null) {
      weeks = 0;
    }
    if (minutes >= 60) {
      log.warning("Minutes must be recalculated!");
      int count = minutes / 60;
      hours += count;
      minutes -= hours * 60;
    }
    if (hours >= prefs.getNumHourPerDay()) {
      log.warning("Hours must be recalculated!");
      int count = hours / prefs.getNumHourPerDay();
      days += count;
      hours -= days * prefs.getNumHourPerDay();
    }
    if (days >= prefs.getNumDaysPerWeek()) {
      log.warning("Days must be recalculated!");
      int count = days / prefs.getNumDaysPerWeek();
      weeks += count;
      days -= weeks * prefs.getNumDaysPerWeek();
    }
    TimeAmountDto rc = new TimeAmountDto();
    rc.setMinutes(minutes);
    rc.setHours(hours);
    rc.setDays(days);
    rc.setWeeks(weeks);
    return rc;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public TimeAmount parseTimeAmount(String s) {
    int minutes = 0;
    Integer hours = null;
    Integer days = null;
    Integer weeks = null;
    TimeAmount rc = createTimeAmount(minutes, hours, days, weeks);
    return rc;
  }
}
