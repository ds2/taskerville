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

/**
 * Some special properties for tasks. This can be usually anything your project
 * needs to know about a task. Consider it as some kind of attribute of a task.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface TaskProperty
    extends
    PersistableObject,
    Comparable<TaskProperty> {
    
    /**
     * Returns the name of the property.
     * 
     * @return the name of the property
     */
    String getName();
    
    /**
     * Returns the id of the type parser for this property.
     * 
     * @return the type parser id
     */
    int getTypeParserId();
}
