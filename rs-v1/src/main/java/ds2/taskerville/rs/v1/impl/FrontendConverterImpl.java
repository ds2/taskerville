/**
 * 
 */
package ds2.taskerville.rs.v1.impl;

import java.util.List;

import ds2.taskerville.api.Project;
import ds2.taskerville.rs.v1.api.FrontendConverter;
import ds2.taskerville.rs.v1.dto.ProjectDto;

/**
 * The FE converter.
 * 
 * @author dstrauss
 * @version 0.1
 */
public class FrontendConverterImpl implements FrontendConverter {
    
    /**
     * Inits the impl.
     */
    public FrontendConverterImpl() {
        // TODO Auto-generated constructor stub
    }
    
    /*
     * (non-Javadoc)
     * @see
     * ds2.taskerville.rs.v1.api.FrontendConverter#toProjects(java.util.List)
     */
    @Override
    public List<ProjectDto> toProjects(final List<Project> allProjects) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /*
     * (non-Javadoc)
     * @see
     * ds2.taskerville.rs.v1.api.FrontendConverter#toProject(ds2.taskerville
     * .api.Project)
     */
    @Override
    public ProjectDto toProject(final Project byId) {
        if (byId == null) {
            return null;
        }
        final ProjectDto rc = new ProjectDto();
        return rc;
    }
    
}
