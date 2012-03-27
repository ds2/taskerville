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
package ds2.taskerville.api.remote;

import ds2.taskerville.api.TimeAmountPrefs;

/**
 * The prefs dto.
 * 
 * @author dstrauss
 * @version 0.1
 * 
 */
public class TimeAmountPrefsDto implements TimeAmountPrefs {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 6260688006819170374L;
    
    /**
     * Inits the dto.
     */
    public TimeAmountPrefsDto() {
        // TODO Auto-generated constructor stub
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TimeAmountPrefs#getNumDaysForOneWeek()
     */
    @Override
    public int getNumDaysPerWeek() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TimeAmountPrefs#getNumHoursForOneDay()
     */
    @Override
    public int getNumHourPerDay() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
