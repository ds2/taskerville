package ds2.taskerville.api.svc;

import ds2.taskerville.api.TimeAmount;

/**
 * The time amount service, to calculate time amounts and efforts.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface TimeAmountService {
	/**
	 * Creates a time amount.
	 * 
	 * @param minutes
	 *            the number of minutes
	 * @param hours
	 *            the number of hours
	 * @param days
	 *            the number of days
	 * @param weeks
	 *            the number of weeks
	 * @return a time amount
	 */
	TimeAmount createTimeAmount(int minutes, Integer hours, Integer days,
			Integer weeks);

	/**
	 * Parses a given string to check for special sequences that define minutes,
	 * hours, days etc.
	 * 
	 * @param s
	 *            the string to parse
	 * @return a time amount, or null if the check was not successful
	 */
	TimeAmount parseTimeAmount(String s);
}
