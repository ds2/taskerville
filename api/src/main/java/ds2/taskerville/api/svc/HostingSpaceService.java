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
