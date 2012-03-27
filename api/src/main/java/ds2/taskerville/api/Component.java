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
package ds2.taskerville.api;

import ds2.taskerville.api.user.User;

/**
 * A software component of a software product.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface Component extends PersistableObject {
    
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
    
    /**
     * Returns the title of the component.
     * 
     * @return the title of the component
     */
    String getTitle();
}
