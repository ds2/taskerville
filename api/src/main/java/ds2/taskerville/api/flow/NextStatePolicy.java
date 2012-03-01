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
package ds2.taskerville.api.flow;

import ds2.taskerville.api.PersistableObject;
import ds2.taskerville.api.user.Recipient;
import java.util.List;

/**
 *
 * @author kaeto23
 */
public interface NextStatePolicy extends PersistableObject {

  /**
   * Returns the flow for this policy.
   *
   * @return the flow
   */
  TaskFlow getFlow();

  /**
   * Returns the state for this resolver.
   *
   * @return this state
   */
  TaskState getCurrentState();

  /**
   * The next state.
   *
   * @return the next state
   */
  TaskState getNextState();

  /**
   * Returns the title for this switch.
   *
   * @return the switch title, or null if not required.
   */
  String getSwitchTitle();

  /**
   * Returns the authorities that are able to perform this task state switch. If
   * empty or null, anyone can do (anyone who is logged in).
   *
   * @return the recipients, that are allowed to perform this state switch.
   */
  List<Recipient> getRequiredAuthorities();
}
