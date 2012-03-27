/**
 * 
 */
package ds2.taskerville.rs.v1.impl;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * The rest endpoint mounter.
 * 
 * @author dstrauss
 * @version 0.1
 */
@ApplicationPath("rs")
public class TaskervilleRestV1Application extends Application {
    
    /**
     * Inits the application.
     */
    public TaskervilleRestV1Application() {
        // nothing special to do
    }
    
    @Override
    public final Set<Class<?>> getClasses() {
        final Set<Class<?>> rsImpls = new HashSet<>();
        rsImpls.add(ProjectsResourceImpl.class);
        return rsImpls;
    }
}
