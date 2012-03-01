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
/**
 * 
 */
package ds2.taskerville.rs.v1.impl;

import java.util.List;

import ds2.taskerville.rs.v1.dto.ProjectDto;
import ds2.taskerville.rs.v1.rs.ProjectsResource;

/**
 * The impl.
 * 
 * @author dstrauss
 * @version 1.0
 */
public class ProjectsResourceImpl implements ProjectsResource {
    
    /**
     * Inits the impl.
     */
    public ProjectsResourceImpl() {
        // TODO Auto-generated constructor stub
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.rs.v1.rs.ProjectsResource#getAllProjects()
     */
    @Override
    public final List<ProjectDto> getAllProjects() {
        // TODO Auto-generated method stub
        return null;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.rs.v1.rs.ProjectsResource#getProjectById(long)
     */
    @Override
    public ProjectDto getProjectById(long id) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /*
     * (non-Javadoc)
     * @see
     * ds2.taskerville.rs.v1.rs.ProjectsResource#getProjectByName(java.lang.
     * String)
     */
    @Override
    public ProjectDto getProjectByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /*
     * (non-Javadoc)
     * @see
     * ds2.taskerville.rs.v1.rs.ProjectsResource#createProject(ds2.taskerville
     * .rs.v1.dto.ProjectDto)
     */
    @Override
    public ProjectDto createProject(ProjectDto p) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.rs.v1.rs.ProjectsResource#updateProject(long,
     * ds2.taskerville.rs.v1.dto.ProjectDto)
     */
    @Override
    public ProjectDto updateProject(long id, ProjectDto p) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.rs.v1.rs.ProjectsResource#deleteProject(long)
     */
    @Override
    public void deleteProject(long id) {
        // TODO Auto-generated method stub
        
    }
    
}
