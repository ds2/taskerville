/**
 * 
 */
package ds2.taskerville.rs.v1.api;

import java.util.List;

import ds2.taskerville.api.Project;
import ds2.taskerville.rs.v1.dto.ProjectDto;

/**
 * Converter for frontend related conversion.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface FrontendConverter {
    
    List<ProjectDto> toProjects(List<Project> allProjects);
    
    ProjectDto toProject(Project byId);
    
}
