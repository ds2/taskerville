/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.api;

import java.io.Serializable;

/**
 * Another persistable object, meant for simple DTOs.
 *
 * @author kaeto23
 */
public interface SimplePersistableObject extends Serializable {

  /**
   * Returns the id of the persistable object.
   *
   * @return the id
   */
  int getId();
}
