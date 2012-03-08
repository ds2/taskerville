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
package ds2.taskerville.api;

import java.io.Serializable;
import java.util.Date;

/**
 * A contract to define some times on an object.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface TimeAware extends PersistableObject {
    
    /**
     * Returns the creation date of the object.
     * 
     * @return the creation data
     */
    Date getCreated();
    
    /**
     * Returns the modification date of the object.
     * 
     * @return the modification date
     */
    Date getModified();
    
    /**
     * Returns the deletion date of this object.
     * 
     * @return the deletion date
     */
    Date getDeleted();
    
    /**
     * Sets the deletion date.
     * 
     * @param d
     *            the deletion date
     */
    void setDeleted(Date d);
    
    /**
     * Touches the modification date to NOW.
     */
    void touchModified();
}
