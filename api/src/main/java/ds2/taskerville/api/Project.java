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
package ds2.taskerville.api;

import java.net.URL;
import java.util.List;

import ds2.taskerville.api.processmanagement.ProcessManagement;

/**
 * The contract for a project. Any task belongs to a project.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface Project extends Component {
	/**
	 * Returns a short title of the project. This is mainly inherited by Jira
	 * where a short project descriptor is used for the project tasks followed
	 * by a number.
	 * 
	 * @return a possibe short id/title
	 */
	String getShortTitle();

	/**
	 * Returns all known task types of this project.
	 * 
	 * @return all known task types
	 */
	List<TaskType> getSupportedTaskTypes();

	/**
	 * Returns all known components this project contains.
	 * 
	 * @return all known components
	 */
	List<Component> getSubComponents();

	/**
	 * Returns a possible homepage for this project.
	 * 
	 * @return a homepage, or null if not applicable.
	 */
	URL getHomepage();

	/**
	 * Returns the process management for this project.
	 * 
	 * @return the process management for this project, or null if not
	 *         applicable
	 */
	ProcessManagement getManagement();

	/**
	 * Returns the entry state of this project.
	 * 
	 * @return the entry state
	 */
	EntryStates getEntryState();
}
