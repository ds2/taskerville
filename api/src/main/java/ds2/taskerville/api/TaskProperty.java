/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.api;

import java.io.Serializable;
import java.util.List;

/**
 * Some special properties for tasks. This can be usually anything your project
 * needs to know about a task. Consider it as some kind of attribute of a task.
 *
 * @author kaeto23
 */
public interface TaskProperty extends PersistableObject,
    Comparable<TaskProperty> {

  /**
   * Returns the name of the property.
   *
   * @return the name of the property
   */
  String getName();

  /**
   * Returns the id of the type parser for this property.
   *
   * @return
   */
  int getTypeParserId();
}
