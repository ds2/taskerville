/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.api.svc;

import java.io.Serializable;
import java.util.List;

import ds2.taskerville.api.Project;
import ds2.taskerville.api.flow.TaskState;
import ds2.taskerville.api.user.User;

/**
 * A flow selector defines the state flow for given task types.
 *
 * @author kaeto23
 */
public interface FlowSelector {

  /**
   * Returns the next states for the given combination of parameters.
   *
   * @param currentState the current state
   * @param p the current project
   * @param user the current user
   * @return the possible next states, or an empty list.
   */
  List<TaskState> getNextStates(TaskState currentState, Project p, User user);

  List<TaskState> getNextStates2(long currentStateId, long projectId,
      long userId);
}
