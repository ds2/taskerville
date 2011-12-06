/**
 * 
 */
package ds2.taskerville.api;

import java.io.Serializable;

/**
 * A work package is defined by a timed amount of work to do.
 * 
 * @author kaeto23
 * 
 */
public interface WorkPackage extends Serializable {
	TimeAmount getTimeAmount();

	String getDescription();
}
