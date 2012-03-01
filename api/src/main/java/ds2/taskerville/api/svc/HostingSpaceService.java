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
package ds2.taskerville.api.svc;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.user.HostingSpace;

/**
 * The service to administrate the hosting spaces.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface HostingSpaceService {
    /**
     * Creates a space.
     * 
     * @param name
     *            the name of the space
     * @return the hosting space
     */
    HostingSpace createSpace(String name);
    
    /**
     * Returns the hosting space with the given id.
     * 
     * @param spaceId
     *            the space id
     * @return the space, or null if not found
     */
    HostingSpace getSpaceById(long spaceId);
    
    /**
     * Sets the state of a given space.
     * 
     * @param spaceId
     *            the space id
     * @param newState
     *            the new state of the space
     * 
     * @return the updated space
     */
    HostingSpace setSpaceState(long spaceId, EntryStates newState);
}
