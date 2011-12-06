/**
 * 
 */
package ds2.taskerville.api.processmanagement;

import java.io.Serializable;
import java.util.Date;

/**
 * A time schedule for finishing a task.
 * 
 * @author kaeto23
 * 
 */
public interface Schedule extends Serializable {
	Date getStartDate();

	Date getDueDate();

}
