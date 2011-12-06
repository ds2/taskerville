/**
 * 
 */
package ds2.taskerville.api;

import java.io.Serializable;

/**
 * A time amount. This is usually a time period where work has to be done or has
 * been done on a given task.
 * 
 * @author kaeto23
 * 
 */
public interface TimeAmount extends Serializable, Comparable<TimeAmount> {
	/**
	 * Returns the number of weeks.
	 * 
	 * @return the number of weeks
	 */
	int getWeeks();

	/**
	 * Returns the number of days.
	 * 
	 * @return the number of days
	 */
	int getDays();

	/**
	 * Returns the number of hours.
	 * 
	 * @return the number of hours
	 */
	int getHours();

	/**
	 * Returns the number of minutes.
	 * 
	 * @return the number of minutes
	 */
	int getMinutes();

	/**
	 * Returns a percent value in the range of -1 to 1 comparing this time
	 * amount with the given time amount. If this time amount is greater than
	 * the given amount, a negative value is returned, indicating the percent
	 * value compared with the given amount.
	 * 
	 * @param t
	 *            the time amount to compare with
	 * @return a value of 0..1 if this amount is less than the given, otherwise
	 *         a negative value.
	 */
	float getPercentComparedTo(TimeAmount t);

	/**
	 * Returns a parsed version of this time amout, using w for weeks, d for
	 * days, h for hourse, m for minutes etc.
	 * 
	 * @return a string representing this time amount.
	 */
	String getParsedString();
}
