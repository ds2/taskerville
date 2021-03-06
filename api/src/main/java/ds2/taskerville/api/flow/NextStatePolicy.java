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
package ds2.taskerville.api.flow;

import java.util.List;

import ds2.taskerville.api.PersistableObject;
import ds2.taskerville.api.user.Team;
import ds2.taskerville.api.user.User;

/**
 * The nextState policy for a task state.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface NextStatePolicy extends PersistableObject {
    
    /**
     * Returns the state for this resolver.
     * 
     * @return this state
     */
    TaskState getCurrentState();
    
    /**
     * Returns the flow for this policy.
     * 
     * @return the flow
     */
    TaskFlow getFlow();
    
    /**
     * The next state.
     * 
     * @return the next state
     */
    TaskState getNextState();
    
    /**
     * Returns the teams that are allowed to switch to this next state.
     * 
     * @return the teams
     */
    List<Team> getRequiredAuthorityTeams();
    
    /**
     * Returns the users that are able to perform this task state switch. If
     * empty or null, anyone can do (anyone who is logged in).
     * 
     * @return the recipients, that are allowed to perform this state switch.
     */
    List<User> getRequiredAuthorityUsers();
    
    /**
     * Returns the title for this switch.
     * 
     * @return the switch title, or null if not required.
     */
    String getSwitchTitle();
}
