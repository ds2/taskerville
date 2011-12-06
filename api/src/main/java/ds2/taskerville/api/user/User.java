/**
 * 
 */
package ds2.taskerville.api.user;

import java.util.List;

/**
 * A user.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface User extends Recipient {
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
