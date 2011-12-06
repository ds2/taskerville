/**
 * 
 */
package ds2.taskerville.api.release;

/**
 * A contract for a Major-Minor version. An example might be 1.23-456 or
 * 1.23.456 as version.
 * 
 * @author kaeto23
 * 
 */
public interface MajorMinorVersion extends Version {
	/**
	 * Returns the major revision number.
	 * 
	 * @return the major revision
	 */
	int getMajor();

	/**
	 * Returns the minor revision number.
	 * 
	 * @return the minor revision
	 */
	int getMinor();

	/**
	 * Returns the build number of this release.
	 * 
	 * @return the build number
	 */
	int getBuild();
}
