/**
 * 
 */
package ds2.taskerville.api;

import java.io.Serializable;

import ds2.taskerville.api.user.User;

/**
 * A log for the work done on a given task.
 * 
 * @author kaeto23
 * 
 */
public interface WorkLog extends Serializable {
	User getWorker();

	Comment getComment();

	TimeAmount getTimeSpent();
}
