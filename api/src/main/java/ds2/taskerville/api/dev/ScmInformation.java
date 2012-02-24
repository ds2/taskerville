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
package ds2.taskerville.api.dev;

import java.io.Serializable;
import java.util.List;

/**
 * Defines some SCM information about a release.
 * 
 * @author kaeto23
 * 
 */
public interface ScmInformation extends Serializable {
	/**
	 * Returns the id of the entry.
	 * 
	 * @return the id of the entry.
	 */
	long getId();

	/**
	 * Returns the scm type.
	 * 
	 * @return the scm type.
	 */
	ScmType getType();

	/**
	 * Returns the branch name for the developers to perform checkins and to
	 * build the prerelease from.
	 * 
	 * @return the developer branch name. Usually HEAD or trunk.
	 */
	String getDeveloperBranch();

	/**
	 * Returns a list of possible prerelease tags.
	 * 
	 * @return a list of scm prerelease tags
	 */
	List<String> getPrereleaseTags();

	/**
	 * Returns the possible prerelease branch where all prereleases are build
	 * from.
	 * 
	 * @return the prerelease branch, or null if unknown.
	 */
	String getPrereleaseBranch();

	/**
	 * Returns the scm tag of the final live version of a release.
	 * 
	 * @return the scm live tag
	 */
	String getLiveTag();

	/**
	 * Returns the live branch where the live version is build from.
	 * 
	 * @return the possible live branch
	 */
	String getLiveBranch();
}
