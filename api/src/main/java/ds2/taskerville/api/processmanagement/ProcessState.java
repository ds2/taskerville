/**
 *
 */
package ds2.taskerville.api.processmanagement;

import ds2.taskerville.api.PersistableObject;
import java.util.List;

/**
 * The state of a process.
 *
 * @author kaeto23
 *
 */
public interface ProcessState extends PersistableObject {

  String getName();

  String getDescription();

  List<ProcessState> getNextStates();

  long getRequiredTaskState();
}
