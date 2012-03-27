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
package ds2.taskerville.api.processmanagement;

import java.io.Serializable;
import java.util.Date;

/**
 * A time schedule for finishing a task.
 * 
 * @author dstrauss
 * @version 0.1
 * 
 */
public interface Schedulable extends Serializable {
    /**
     * Returns the possible due date for this task.
     * 
     * @return the due date
     */
    Date getDueDate();
    
    /**
     * Returns the start date of the task.
     * 
     * @return the start date
     */
    Date getStartDate();
    
    /**
     * Sets a new due date.
     * 
     * @param d
     *            the new due date
     */
    void setDueDate(Date d);
    
    /**
     * Sets the new start date.
     * 
     * @param d
     *            the start date
     */
    void setStartDate(Date d);
    
}
