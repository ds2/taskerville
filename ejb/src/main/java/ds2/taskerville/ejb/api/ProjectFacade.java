/**
 * 
 */
package ds2.taskerville.ejb.api;

import java.util.List;

import ds2.taskerville.api.Project;

/**
 * The service facade for dealing with projects.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface ProjectFacade {
    /**
     * Returns all known projects.
     * 
     * @return all projects
     */
    List<Project> getAllProjects();
    
    Project getById(long id);
    
    Project getByShortcode(String name);
    
}
