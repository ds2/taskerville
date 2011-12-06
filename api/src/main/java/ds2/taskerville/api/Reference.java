/**
 * 
 */
package ds2.taskerville.api;

import ds2.taskerville.api.flow.TaskState;

import java.io.Serializable;

/**
 * A reference between two tasks.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface Reference extends Serializable {
	/**
	 * Returns the referenced task.
	 * 
	 * @return the referenced task
	 */
	Task getReferencedTask();

	/**
	 * Returns the type of the reference.
	 * 
	 * @return the type.
	 */
	ReferenceType getReferenceType();

	/**
	 * This will return the required state of the referenced task. This will
	 * stop the current task from being "up"-stated as long as this subtask
	 * reaches the mentioned state. Be aware that this returns the state of the
	 * "other" task.
	 * 
	 * @return the state of the referenced task. May return null if not
	 *         important.
	 */
	TaskState getRequiredReferenceState();
}
