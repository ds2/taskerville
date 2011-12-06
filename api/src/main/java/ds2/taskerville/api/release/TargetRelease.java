/**
 * 
 */
package ds2.taskerville.api.release;

import java.io.Serializable;
import java.util.Date;

import ds2.taskerville.api.Project;
import ds2.taskerville.api.dev.ScmInformation;

/**
 * A software release.
 * 
 * @author kaeto23
 * 
 */
public interface TargetRelease extends Serializable {
	/**
	 * Returns the id of the release.
	 * 
	 * @return the internal id of the release.
	 */
	long getId();

	/**
	 * Returns the project this release belongs to.
	 * 
	 * @return the project.
	 */
	Project getProject();

	/**
	 * Returns the version of this release.
	 * 
	 * @return the version.
	 */
	Version getVersion();

	/**
	 * Returns the description of this release.
	 * 
	 * @return the description
	 */
	String getDescription();

	/**
	 * Returns the start date for the developers to start coding for this
	 * release.
	 * 
	 * @return the developer start date
	 */
	Date getDeveloperStartDate();

	/**
	 * Returns the prerelease date for this release. With this date, the coding
	 * MAY stop, and the QA phase may begin.
	 * 
	 * @return the prerelease date.
	 */
	Date getPrereleaseDate();

	/**
	 * Returns the official live date.
	 * 
	 * @return the official live date
	 */
	Date getLiveDate();

	/**
	 * Returns the final live date of the software release. If this field is
	 * set, no changes can be performed to the involved tasks.
	 * 
	 * @return null, if not yet switched live, or the live switch date.
	 */
	Date getFinalLiveDate();

	/**
	 * Returns some SCM information about this release. This is an extension to
	 * support the auto-build feature.
	 * 
	 * @return a possible scm information. Or null if not known.
	 */
	ScmInformation getScm();
}
