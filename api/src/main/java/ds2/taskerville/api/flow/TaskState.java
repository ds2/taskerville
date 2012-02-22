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
