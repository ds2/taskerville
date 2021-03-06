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

import java.util.List;

import ds2.taskerville.api.ProjectCategory;
import ds2.taskerville.api.StateAware;
import ds2.taskerville.api.TimeAware;

/**
 * A hosting space defines a defined set of users, teams and projects belonging
 * to a single entity. Mostly a company.
 * 
 * @author dstrauss
 * @version 0.1
 * 
 */
public interface HostingSpace extends StateAware, TimeAware {
    
    /**
     * Returns all known project categories for this hosting space.
     * 
     * @return all project categories for this space
     */
    List<ProjectCategory> getCategories();
    
    /**
     * Returns the name of this hosting space.
     * 
     * @return the name
     */
    String getName();
    
    /**
     * Returns all registered teams for this hosting space.
     * 
     * @return all known teams
     */
    List<Team> getTeams();
    
    /**
     * Returns all registered users for this hosting space.
     * 
     * @return all known users
     */
    List<User> getUsers();
}
