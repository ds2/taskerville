/**
 * 
 */
package ds2.taskerville.api.remote;

import ds2.taskerville.api.TimeAmountPrefs;

/**
 * @author kaeto23
 *
 */
public class TimeAmountPrefsDto implements TimeAmountPrefs {

	/**
	 * 
	 */
	public TimeAmountPrefsDto() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see ds2.taskerville.api.TimeAmountPrefs#getNumDaysForOneWeek()
	 */
	@Override
	public int getNumDaysPerWeek() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see ds2.taskerville.api.TimeAmountPrefs#getNumHoursForOneDay()
	 */
	@Override
	public int getNumHourPerDay() {
		// TODO Auto-generated method stub
		return 0;
	}

}
