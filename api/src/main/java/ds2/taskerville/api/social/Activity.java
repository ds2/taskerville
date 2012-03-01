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
package ds2.taskerville.api.social;

import java.io.Serializable;

import ds2.taskerville.api.Task;
import ds2.taskerville.api.user.User;

/**
 * An activity on a task.
 * 
 * @author dstrauss
 * @version 0.1
 * 
 */
public interface Activity extends Serializable {
    /**
     * Returns the task this activity belongs to.
     * 
     * @return the involved task for this activity.
     */
    Task getInvolvedTask();
    
    /**
     * Returns the user who invoked this activity.
     * 
     * @return the user, or null if not applicable
     */
    User getUser();
    
    /**
     * Returns the type of the activity.
     * 
     * @return the type of the activity
     */
    ActivityType getType();
    
    /**
     * Returns the primary key id of the activity item. This can be: a comment
     * id, a task id, an attachment id etc.
     * 
     * @return the id of the involved activity item
     */
    long getInvolvedId();
}
