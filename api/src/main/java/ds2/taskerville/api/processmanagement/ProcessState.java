/**
 * 
 */
package ds2.taskerville.api.processmanagement;

import java.util.List;

/**
 * The state of a process.
 * 
 * @author kaeto23
 * 
 */
public interface ProcessState {
	long getId();

	String getName();

	String getDescription();

	List<ProcessState> getNextStates();

	long getRequiredTaskState();
}
