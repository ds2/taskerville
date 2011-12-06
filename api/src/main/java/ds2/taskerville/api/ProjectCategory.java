/**
 * 
 */
package ds2.taskerville.api;

import java.io.Serializable;

/**
 * Definition of a project category. A project category contains a set of
 * projects.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface ProjectCategory extends Serializable,
		Comparable<ProjectCategory> {
	/**
	 * Returns the id of the entry.
	 * 
	 * @return the id of the entry
	 */
	long getId();

	/**
	 * Returns the title of the category.
	 * 
	 * @return the title of the category
	 */
	String getTitle();

	/**
	 * Returns a description of the category.
	 * 
	 * @return a description
	 */
	String getDescription();

	/**
	 * Returns the entry state of the category.
	 * 
	 * @return the entry state
	 */
	EntryStates getEntryState();
}
