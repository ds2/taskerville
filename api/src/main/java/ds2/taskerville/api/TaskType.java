/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.api;

import java.io.Serializable;
import java.util.List;

/**
 * The type of a task. Something like Bug, Feature, or something alike.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface TaskType extends Serializable {
	/**
	 * Returns the id of the type.
	 * 
	 * @return the id of the type
	 */
	long getId();

	/**
	 * Returns the title of this type.
	 * 
	 * @return the title of this type
	 */
	String getTitle();

	/**
	 * Returns a possible description of this type.
	 * 
	 * @return a possible description
	 */
	String getDescription();

	/**
	 * Returns a list of properties that must be filled when using this type.
	 * 
	 * @return a list of required properties for this type of task.
	 */
	List<TaskProperty> getRequiredProperties();
}
