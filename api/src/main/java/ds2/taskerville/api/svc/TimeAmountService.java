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
package ds2.taskerville.api.svc;

import ds2.taskerville.api.TimeAmount;

/**
 * The time amount service, to calculate time amounts and efforts.
 * 
 * @author dstrauss
 * @version 0.1
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
