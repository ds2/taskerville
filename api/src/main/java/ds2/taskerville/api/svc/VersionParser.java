/**
 * 
 */
package ds2.taskerville.api.svc;

import ds2.taskerville.api.release.Version;

/**
 * A contract for a version parser.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface VersionParser {
    String toVersion(Version v);
    
    Version parse(String s);
}
