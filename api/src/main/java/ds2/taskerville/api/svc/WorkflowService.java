/**
 * 
 */
package ds2.taskerville.api.svc;

import ds2.taskerville.api.processmanagement.ProcessState;

/**
 * Administrative API to create work flows.
 * 
 * @author kaeto23
 * 
 */
public interface WorkflowService {
	ProcessState createState(String name, String descr);

	ProcessState addNextState(long currentStateId, long nextStateId);

	ProcessState removeNextState(long currentStateId, long nextStateId);
}
