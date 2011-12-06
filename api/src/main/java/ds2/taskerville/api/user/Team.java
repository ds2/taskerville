/**
 * 
 */
package ds2.taskerville.api.user;

import java.util.List;

/**
 * A team of users. It has a leader, and a number of members of different roles.
 * 
 * @author kaeto23
 * @version 1.0
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
