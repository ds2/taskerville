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

/**
 * The priority of a task.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface Priority extends TimeAware, Comparable<Priority> {
    /**
     * Returns the title of the priority.
     * 
     * @return the title
     */
    String getTitle();
    
    /**
     * Returns the description of this priority.
     * 
     * @return the description
     */
    String getDescription();
    
    /**
     * A basic weight index, telling the weight of the priority. 1 is blocker, 0
     * is nothing.
     * 
     * @return the weight
     */
    float getWeight();
}
