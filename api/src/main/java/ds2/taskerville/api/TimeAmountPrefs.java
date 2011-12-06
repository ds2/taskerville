/**
 * 
 */
package ds2.taskerville.api;

import java.io.Serializable;

/**
 * Some preferences for calculating the time amount.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface TimeAmountPrefs extends Serializable {
	/**
	 * the property name for the numDaysPerWeek.
	 */
	static final String PROPERTY_NUMDAYSPERWEEK = "taskerville.numdaysperweek";
	/**
	 * The property name for the numHoursPerDay.
	 */
	static final String PROPERTY_NUMHOURSPERDAY = "taskerville.numhoursperday";

	/**
	 * Returns the number of days per week.
	 * 
	 * @return the number of days per week
	 */
	int getNumDaysPerWeek();

	/**
	 * Returns the number of hours per day.
	 * 
	 * @return the number of hours per day.
	 */
	int getNumHourPerDay();
}
