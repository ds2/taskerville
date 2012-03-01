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
package ds2.taskerville.api.svc;

import java.util.List;

import ds2.taskerville.api.Project;
import ds2.taskerville.api.ProjectCategory;
import ds2.taskerville.api.Task;
import ds2.taskerville.api.TaskProperty;
import ds2.taskerville.api.TaskType;
import ds2.taskerville.api.user.User;

/**
 * This contract defines the methods to actually "work" with taskerville.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface TaskerVilleService {
    /**
     * Returns all project categories of this installation.
     * 
     * @return all project categories.
     */
    List<ProjectCategory> getAllCategories();
    
    /**
     * Returns all known task groups.
     * 
     * @return all known task groups
     */
    List<Project> getAllProjects();
    
    /**
     * Creates a task.
     * 
     * @param title
     *            the title of the task
     * @param descr
     *            a description
     * @param creator
     *            the creator
     * @param type
     *            the type of the task (the type references the task group
     *            indirectly)
     * @param properties
     *            the list of required properties. This depends on the type of
     *            the task.
     * @param tags
     *            a list of tags
     * @return a task
     */
    Task createTask(String title, String descr, User creator, TaskType type,
        List<TaskProperty> properties, List<String> tags);
    
    /**
     * Deletes a task with the given id.
     * 
     * @param taskId
     *            the task id to delete
     * @return TRUE if successful (task found, allowed to delete, delete
     *         successful), otherwise FALSE.
     */
    boolean deleteTask(long taskId);
}
