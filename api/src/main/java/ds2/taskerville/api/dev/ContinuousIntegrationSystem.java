/**
 * 
 */
package ds2.taskerville.api.dev;

import java.net.URL;

/**
 * @author kaeto23
 * 
 */
public interface ContinuousIntegrationSystem {
	CiTypes getType();

	URL getProjectHomeUrl();
}
