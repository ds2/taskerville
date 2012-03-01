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
package ds2.taskerville.api.util;

import ds2.taskerville.api.flow.TaskFlow;
import ds2.taskerville.api.user.HostingSpace;

/**
 * A converter for converting several formats.
 *
 * @author kaeto23
 * @version 1.0
 */
public interface ConverterService {

  /**
   * Converts a string into a int value.
   *
   * @param s the string version of an int number
   * @param defValue a default value in case of an error
   * @return the default value, or the converted value
   */
  int toInt(String s, int defValue);

  /**
   * Converts a given hosting space dto into another dto.
   *
   * @param e the origin
   * @return the copy
   */
  HostingSpace toHostingSpace(HostingSpace e);

  /**
   * Converts a given task flow dto into another dto.
   *
   * @param t the origin
   * @return the copy
   */
  TaskFlow toTaskFlow(TaskFlow t);
}
