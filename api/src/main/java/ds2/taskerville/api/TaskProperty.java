/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ds2.taskerville.api;

import java.io.Serializable;
import java.util.List;

/**
 * Some special properties for tasks. This can be usually anything your project
 * needs to know about a task. Consider it as some kind of attribute of a task.
 * 
 * @author kaeto23
 */
public interface TaskProperty extends Serializable, Comparable<TaskProperty> {
	/**
	 * Returns the name of the property.
	 * 
	 * @return the name of the property
	 */
	String getName();

	/**
	 * Returns the current value of the property.
	 * 
	 * @return the current value
	 */
	String getValue();

	/**
	 * Returns a possible list of valid property values that should be used
	 * instead.
	 * 
	 * @return an empty list, or a list of values that should be used as
	 *         property values.
	 */
	List<String> getEnumValues();

	/**
	 * This method is important as it checks if the current property is valid
	 * (according to its value).
	 * 
	 * @return TRUE if the value is ok, otherwise FALSE
	 */
	boolean hasValidValue();
}
