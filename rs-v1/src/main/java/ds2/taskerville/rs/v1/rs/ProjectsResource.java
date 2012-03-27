/*
 * TaskerVille - issue and project management
 * Copyright (C) 2012  Dirk Strauss
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ds2.taskerville.rs.v1.rs;

import java.util.List;

import javax.enterprise.context.RequestScoped;
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
 * @version 0.1
 */
@Path("p")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@RequestScoped
public interface ProjectsResource {
    /**
     * Creates a new project.
     * 
     * @param p
     *            the project details
     * @return the updated project
     */
    @PUT
    ProjectDto createProject(ProjectDto p);
    
    /**
     * Deletes a project.
     * 
     * @param id
     *            the id of the project
     */
    @DELETE
    @Path("/{id}")
    void deleteProject(@PathParam("id") long id);
    
    /**
     * Returns all known projects.
     * 
     * @return all known projects
     */
    @GET
    List<ProjectDto> getAllProjects();
    
    /**
     * Returns the project with the given id.
     * 
     * @param id
     *            the id of the project
     * @return the project, or nothing if not found
     */
    @GET
    @Path("/{id:[0-9]+}")
    ProjectDto getProjectById(@PathParam("id") long id);
    
    /**
     * Returns the project with the given short name.
     * 
     * @param name
     *            the short name
     * @return the project, or nothing if not found
     */
    @GET
    @Path("/{sc:[a-zA-Z0-9]+}")
    ProjectDto getProjectByName(@PathParam("sc") String name);
    
    /**
     * Updates an existing project.
     * 
     * @param id
     *            the id of the project
     * @param p
     *            the project delta
     * @return the updated project
     */
    @POST
    @Path("/{id:[0-9]+}")
    ProjectDto updateProject(@PathParam("id") long id, ProjectDto p);
}
