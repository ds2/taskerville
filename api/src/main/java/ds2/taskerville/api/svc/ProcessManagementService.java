/**
 * 
 */
package ds2.taskerville.api.svc;

import java.util.List;

import ds2.taskerville.api.Task;
import ds2.taskerville.api.processmanagement.ProcessState;

/**
 * A service for managing tasks via processes.
 * 
 * @author kaeto23
 * 
 */
public interface ProcessManagementService extends WorkflowService {
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

	/**
	 * Returns all known tasks of the given process state.
	 * 
	 * @param state
	 *            the process state
	 * @return all known tasks of this state
	 */
	List<Task> getTasksOfState(ProcessState state);

}
