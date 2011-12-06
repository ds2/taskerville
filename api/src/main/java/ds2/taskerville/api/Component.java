/**
 * 
 */
package ds2.taskerville.api;

import java.io.Serializable;

import ds2.taskerville.api.user.User;

/**
 * A software component of a software product.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface Component extends Serializable {
	/**
	 * Returns the id of the entry.
	 * 
	 * @return the id of the entry
	 */
	long getId();

	/**
	 * Returns the title of the component.
	 * 
	 * @return the title of the component
	 */
	String getTitle();

	/**
	 * Returns a description of the component.
	 * 
	 * @return a description of the component
	 */
	String getDescription();

	/**
	 * Returns the main owner of this component.
	 * 
	 * @return the main owner
	 */
	User getLead();
}
