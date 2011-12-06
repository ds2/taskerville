/**
 * 
 */
package ds2.taskerville.api.processmanagement;

/**
 * A contract for a process management.
 * 
 * @author kaeto23
 * 
 */
public interface ProcessManagement {
	/**
	 * Returns the type of the process management.
	 * 
	 * @return the management types
	 */
	ProcessManagementTypes getType();
}
