/**
 * 
 */
package ds2.taskerville.api.social;

import java.io.Serializable;

import ds2.taskerville.api.Task;
import ds2.taskerville.api.user.User;

/**
 * An activity on a task.
 * 
 * @author kaeto23
 * @version 1.0
 * 
 */
public interface Activity extends Serializable {
	/**
	 * Returns the task this activity belongs to.
	 * 
	 * @return the involved task for this activity.
	 */
	Task getInvolvedTask();

	/**
	 * Returns the user who invoked this activity.
	 * 
	 * @return the user, or null if not applicable
	 */
	User getUser();

	/**
	 * Returns the type of the activity.
	 * 
	 * @return the type of the activity
	 */
	ActivityType getType();

	/**
	 * Returns the primary key id of the activity item. This can be: a comment
	 * id, a task id, an attachment id etc.
	 * 
	 * @return the id of the involved activity item
	 */
	long getInvolvedId();
}
