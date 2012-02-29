package ds2.taskerville.api.flow;

import ds2.taskerville.api.PersistableObject;
import ds2.taskerville.api.Project;

/**
 *
 * @author kaeto23
 */
public interface TaskFlow extends PersistableObject {

  /**
   * Returns the name of the flow.
   *
   * @return the flow name
   */
  String getName();

  /**
   * Returns the start state of this flow.
   *
   * @return the start state
   */
  TaskState getStartState();

  /**
   * Returns the project this flow belongs to.
   *
   * @return the project
   */
  Project getProject();
}
