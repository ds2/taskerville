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

import java.io.Serializable;

import ds2.taskerville.api.user.User;

/**
 * A software component of a software product.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface Component extends Serializable {
	/**
	 * Returns the id of the entry.
	 * 
	 * @return the id of the entry
	 */
	long getId();

	/**
	 * Returns the title of the component.
	 * 
	 * @return the title of the component
	 */
	String getTitle();

	/**
	 * Returns a description of the component.
	 * 
	 * @return a description of the component
	 */
	String getDescription();

	/**
	 * Returns the main owner of this component.
	 * 
	 * @return the main owner
	 */
	User getLead();
}
