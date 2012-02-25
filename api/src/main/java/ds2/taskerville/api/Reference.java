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

import ds2.taskerville.api.flow.TaskState;

import java.io.Serializable;

/**
 * A reference between two tasks.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface Reference extends Serializable {
	/**
	 * Returns the referenced task.
	 * 
	 * @return the referenced task
	 */
	Task getReferencedTask();

	/**
	 * Returns the type of the reference.
	 * 
	 * @return the type.
	 */
	ReferenceType getReferenceType();

	/**
	 * This will return the required state of the referenced task. This will
	 * stop the current task from being "up"-stated as long as this subtask
	 * reaches the mentioned state. Be aware that this returns the state of the
	 * "other" task.
	 * 
	 * @return the state of the referenced task. May return null if not
	 *         important.
	 */
	TaskState getRequiredReferenceState();
}
