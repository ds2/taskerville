/**
 * The unification of users and teams.
 */
package ds2.taskerville.api.user;

import ds2.taskerville.api.TimeAware;

/**
 * A recipient of a notification.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface Recipient extends TimeAware {
    /**
     * Returns the user.
     * 
     * @return the user
     */
    User getUser();
    
    /**
     * Returns the team.
     * 
     * @return the team
     */
    Team getTeam();
}
