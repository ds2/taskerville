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
package ds2.taskerville.api.user;

import ds2.taskerville.api.PersistableObject;

/**
 * The role of a user. Usually, something like developer, productionmanager,
 * serveradmin, releasemanager, producer etc. Basically a job title. A user can
 * own a number of roles, depending on his/her relation to a project.
 * 
 * @author dstrauss
 * @version 0.1
 * 
 */
public interface UserRole extends PersistableObject {
    /**
     * Returns a possible description of the role.
     * 
     * @return a description
     */
    String getDescription();
    
    /**
     * Returns the title of the role.
     * 
     * @return the title
     */
    String getTitle();
}
