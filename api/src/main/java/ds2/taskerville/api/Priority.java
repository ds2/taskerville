/**
 * 
 */
package ds2.taskerville.api;

import java.io.Serializable;

/**
 * The priority of a task.
 * 
 * @author kaeto23
 * 
 */
public interface Priority extends Serializable {
	long getId();

	String getTitle();

	String getDescription();
}
