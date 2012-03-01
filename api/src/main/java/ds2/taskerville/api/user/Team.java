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

/**
 * A team of users. It has a leader, and a number of members of different roles.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface Team extends Recipient {
    /**
     * Returns a list of members.
     * 
     * @return a list of members. May return null if no members are added yet.
     */
    List<User> getMembers();
    
    /**
     * Returns a possible list of sub teams.
     * 
     * @return a list of sub teams. May return null if no sub teams are
     *         available.
     */
    List<Team> getSubTeams();
    
    /**
     * Returns the team leader of this team.
     * 
     * @return the team leader
     */
    User getTeamLeader();
    
    /**
     * Returns a list of members of the specified role in this team.
     * 
     * @return a list of members, or null if no member could be found matching
     *         the given role.
     * @param r
     *            the user role
     */
    List<User> getUsersOfRole(UserRole r);
}
