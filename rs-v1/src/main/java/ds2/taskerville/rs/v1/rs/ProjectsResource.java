/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.rs.v1.rs;

import ds2.taskerville.rs.v1.dto.ProjectDto;
import java.util.List;
import javax.ws.rs.*;

/**
 *
 * @author kaeto23
 */
@Path("/p")
public interface ProjectsResource {

  @GET
  List<ProjectDto> getAllProjects();

  @GET
  @Path("/{id}")
  ProjectDto getProjectById(@PathParam("id") long id);

  @GET
  @Path("/{sc}")
  ProjectDto getProjectByName(@PathParam("sc") String name);

  @PUT
  ProjectDto createProject(ProjectDto p);

  @POST
  @Path("/{id}")
  ProjectDto updateProject(@PathParam("id") long id, ProjectDto p);

  @DELETE
  @Path("/{id}")
  void deleteProject(@PathParam("id") long id);
}
