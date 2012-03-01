/*
 * TaskerVille - issue and project management
 * Copyright (C) 2012  Dirk Strauss
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ds2.taskerville.api.svc;

import java.util.List;

import ds2.taskerville.api.Project;
import ds2.taskerville.api.flow.TaskFlow;
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
  List<TaskState> getNextStates(TaskFlow flow, TaskState currentState, Project p,
      User user);

  /**
   * A simplification of the method {@link #getNextStates(ds2.taskerville.api.flow.TaskFlow, ds2.taskerville.api.flow.TaskState, ds2.taskerville.api.Project, ds2.taskerville.api.user.User)
   * }.
   *
   * @param flowId the flow id
   * @param currentStateId the id of the current state
   * @param projectId the id of the project
   * @param userId the id of the user
   * @return the possible next states
   */
  List<TaskState> getNextStates2(long flowId, long currentStateId,
      long projectId,
      long userId);
}
