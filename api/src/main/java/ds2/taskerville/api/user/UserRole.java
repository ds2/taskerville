/**
 * 
 */
package ds2.taskerville.api.user;

import java.io.Serializable;

/**
 * The role of a user. Usually, something like developer, productionmanager,
 * serveradmin, releasemanager, producer etc. Basically a job title. A user can
 * own a number of roles, depending on his/her relation to a project.
 * 
 * @author kaeto23
 * 
 */
public interface UserRole extends Serializable {
	String getDescription();

	/**
	 * Returns the id of the entry.
	 * 
	 * @return
	 */
	long getId();

	String getTitle();
}
