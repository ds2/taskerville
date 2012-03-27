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

import ds2.taskerville.api.Task;
import ds2.taskerville.api.processmanagement.ProcessState;

/**
 * A service for managing tasks via processes.
 * 
 * @author dstrauss
 * @version 0.1
 * 
 */
public interface ProcessManagementService extends WorkflowService {
    /**
     * Returns all known tasks of the given process state.
     * 
     * @param state
     *            the process state
     * @return all known tasks of this state
     */
    List<Task> getTasksOfState(ProcessState state);
    
    /**
     * Sets a new state of the given task.
     * 
     * @param task
     *            the task to switch
     * @param newState
     *            the new state
     * @return TRUE if successful, otherwise FALSE
     */
    boolean setState(Task task, ProcessState newState);
    
}
