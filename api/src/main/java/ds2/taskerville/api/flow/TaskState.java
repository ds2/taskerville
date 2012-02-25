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
package ds2.taskerville.api.flow;

import ds2.taskerville.api.PersistableObject;
import ds2.taskerville.api.TaskProperty;

import java.util.List;

/**
 * The state of a task. Something like Developing, QA Phase, Live Test etc.
 *
 * @author kaeto23
 *
 */
public interface TaskState extends PersistableObject {

  /**
   * Returns the title of the state.
   *
   * @return the title
   */
  String getStateTitle();

  /**
   * Returns a possible description of the state.
   *
   * @return a description, or null if not necessary
   */
  String getStateDescription();

  /**
   * Returns a list of required properties to enter this state. If the given
   * properties are not part of the task, then the task may become invalid.
   *
   * @return a list of required properties for this state.
   */
  List<TaskProperty> getRequiredProperties();
}
