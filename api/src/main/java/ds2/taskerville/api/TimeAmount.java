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
