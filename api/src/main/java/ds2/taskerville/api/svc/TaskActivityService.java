/**
 * 
 */
package ds2.taskerville.api.svc;

import java.util.List;

import ds2.taskerville.api.Comment;
import ds2.taskerville.api.Task;
import ds2.taskerville.api.TaskProperty;
import ds2.taskerville.api.social.Activity;
import ds2.taskerville.api.social.ActivityType;
import ds2.taskerville.api.user.User;

/**
 * The task activity service.
 * 
 * @author kaeto23
 * 
 */
public interface TaskActivityService {
	Activity addActivity(Task t, User u, ActivityType type, Comment comment,
			TaskProperty prop);

	List<Activity> getActivities(User viewer);
}
