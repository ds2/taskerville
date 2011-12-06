/**
 * 
 */
package ds2.taskerville.api.release;

import java.io.Serializable;

/**
 * A version identifier.
 * 
 * @author kaeto23
 * 
 */
public interface Version extends Comparable<Version>, Serializable {
	/**
	 * Returns a printable form of the version. Implementations may override
	 * this method to return something "fancy".
	 * 
	 * @return a printable form of the version.
	 */
	String getPrintable();
}
