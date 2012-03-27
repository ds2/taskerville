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
 * A list of task management systems, or issue trackers.
 * 
 * @author dstrauss
 * @version 0.1
 */
public enum TaskManagementSystems {
    /**
     * Bugzilla.
     */
    Bugzilla,
    /**
     * Google Code.
     */
    GoogleCode,
    /**
     * Jira.
     */
    Jira,
    /**
     * Redmine.
     */
    Redmine,
    /**
     * Taskerville.
     */
    Taskerville,
    /**
     * Trac.
     */
    Trac;
}
