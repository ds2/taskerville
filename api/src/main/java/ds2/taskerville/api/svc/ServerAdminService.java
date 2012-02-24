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
package ds2.taskerville.api.svc;

import java.util.List;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.Project;
import ds2.taskerville.api.ProjectCategory;
import ds2.taskerville.api.TaskProperty;
import ds2.taskerville.api.TaskType;

/**
 * Some service methods for administering taskerville.
 * 
 * @author kaeto23
 * 
 */
public interface ServerAdminService {
	/**
	 * Creates a category.
	 * 
	 * @param title
	 *            the title of the category
	 * @param descr
	 *            a possible description
	 * @return null, or the category
	 */
	ProjectCategory createCategory(String title, String descr);

	/**
	 * Creates a project for a given category.
	 * 
	 * @param categoryId
	 *            the category id for the project
	 * @param title
	 *            the title of the project
	 * @param descr
	 *            a description of the project
	 * @param projectOwnerId
	 *            the id of the user who will own this project
	 * 
	 * @return the project, or null in case of an error
	 */
	Project createProject(long categoryId, String title, String descr,
			long projectOwnerId);

	/**
	 * Creates a task type for a given project.
	 * 
	 * @param title
	 *            the title of the type
	 * @param descr
	 *            a description of the type
	 * @param reqProps
	 *            a list of required properties that are added to this type.
	 * @param projId
	 *            the project id this type will belong to
	 * @return the type, or null in case of an error
	 */
	TaskType createType(String title, String descr, List<TaskProperty> reqProps,
			long projId);

	/**
	 * Sets the state of a type.
	 * 
	 * @param typeId
	 *            the id of the type
	 * @param newState
	 *            the new state of the type
	 * @return the updated type
	 */
	TaskType setTypeState(long typeId, EntryStates newState);

	/**
	 * Sets the state of a project.
	 * 
	 * @param projId
	 *            the project id
	 * @param newState
	 *            the new state of the project
	 * @return the updated project
	 */
	Project setProjectState(long projId, EntryStates newState);

	/**
	 * Sets the state of a category.
	 * 
	 * @param categoryId
	 *            the category id
	 * @param newState
	 *            the new state of the category
	 * @return the updated category
	 */
	ProjectCategory setCategoryState(long categoryId, EntryStates newState);
}
