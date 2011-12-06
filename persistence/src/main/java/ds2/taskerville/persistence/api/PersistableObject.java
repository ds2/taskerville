package ds2.taskerville.persistence.api;

import java.io.Serializable;

/**
 * Contract for a persistable object.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface PersistableObject extends Serializable {
	/**
	 * Returns the primary key of this object.
	 * 
	 * @return the primary key, or entry id of this object
	 */
	long getId();
}
