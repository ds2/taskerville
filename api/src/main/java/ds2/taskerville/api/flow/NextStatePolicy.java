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
