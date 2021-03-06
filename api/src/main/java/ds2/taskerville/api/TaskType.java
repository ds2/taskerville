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

import java.util.List;

import ds2.taskerville.api.flow.TaskFlow;

/**
 * The type of a task. Something like Bug, Feature, or something alike.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface TaskType extends StateAware {
    
    /**
     * Returns a possible description of this type.
     * 
     * @return a possible description
     */
    String getDescription();
    
    /**
     * Returns the flow for this task type.
     * 
     * @return the flow
     */
    TaskFlow getFlow();
    
    /**
     * Returns a list of properties that must be filled when using this type.
     * 
     * @return a list of required properties for this type of task.
     */
    List<TaskProperty> getRequiredProperties();
    
    /**
     * Returns the title of this type.
     * 
     * @return the title of this type
     */
    String getTitle();
}
