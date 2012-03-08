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
 * A user.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface User extends RecipientBase {
    /**
     * Returns a list of teams this user is a member of.
     * 
     * @return a list of teams. May return null if the user is no member of any
     *         team.
     */
    List<Team> getMemberTeams();
    
    /**
     * Returns a list of roles this user owns.
     * 
     * @return a list of user roles
     */
    List<UserRole> getRoles();
    
}
