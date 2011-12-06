/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ds2.taskerville.api.flow;

import java.io.Serializable;
import java.util.List;

import ds2.taskerville.api.Project;
import ds2.taskerville.api.user.User;

/**
 * A flow selector defines the state flow for given task types.
 * 
 * @author kaeto23
 */
public interface FlowSelector extends Serializable {
	List<TaskState> getNextStates(TaskState currentState, Project p, User user);
}
