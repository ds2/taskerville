/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.rs.v1.rs;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ds2.taskerville.rs.v1.dto.ProjectDto;

/**
 * The projects resource.
 * 
 * @author dstrauss
 * @version 1.0
 */
@Path("/p")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public interface ProjectsResource {
    /**
     * Returns all known projects.
     * 
     * @return all known projects
     */
    @GET
    List<ProjectDto> getAllProjects();
    
    @GET
    @Path("/{id:[0-9]+}")
    ProjectDto getProjectById(@PathParam("id") long id);
    
    @GET
    @Path("/{sc:[a-zA-Z0-9]+}")
    ProjectDto getProjectByName(@PathParam("sc") String name);
    
    @PUT
    ProjectDto createProject(ProjectDto p);
    
    @POST
    @Path("/{id:[0-9]+}")
    ProjectDto updateProject(@PathParam("id") long id, ProjectDto p);
    
    @DELETE
    @Path("/{id}")
    void deleteProject(@PathParam("id") long id);
}
