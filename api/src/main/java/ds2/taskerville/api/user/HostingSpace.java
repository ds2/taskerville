/**
 * 
 */
package ds2.taskerville.api.user;

import java.util.List;

import ds2.taskerville.api.PersistableObject;
import ds2.taskerville.api.ProjectCategory;

/**
 * A hosting space defines a defined set of users, teams and projects belonging
 * to a single entity. Mostly a company.
 * 
 * @author kaeto23
 * 
 */
public interface HostingSpace extends PersistableObject {
    /**
     * Returns the name of this hosting space.
     * 
     * @return the name
     */
    String getName();
    
    /**
     * Returns all registered users for this hosting space.
     * 
     * @return all known users
     */
    List<User> getUsers();
    
    /**
     * Returns all registered teams for this hosting space.
     * 
     * @return all known teams
     */
    List<Team> getTeams();
    
    /**
     * Returns all known project categories for this hosting space.
     * 
     * @return all project categories for this space
     */
    List<ProjectCategory> getCategories();
}
