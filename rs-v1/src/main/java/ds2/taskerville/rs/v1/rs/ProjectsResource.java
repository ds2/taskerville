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
