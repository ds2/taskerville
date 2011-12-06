/**
 * 
 */
package ds2.taskerville.api.release;

/**
 * A declaration for a maven-typical version schema.
 * 
 * @author kaeto23
 * 
 */
public interface MavenVersion extends MajorMinorVersion {
	/**
	 * Returns the string identifier for this version. Usually SNAPSHOT by
	 * default.
	 * 
	 * @return the string identifier for this version.
	 */
	String getIdentifier();
}
