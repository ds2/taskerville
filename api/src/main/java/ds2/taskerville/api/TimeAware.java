/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.api;

import java.io.Serializable;
import java.util.Date;

/**
 * A contract to define some times on an object.
 *
 * @author kaeto23
 */
public interface TimeAware extends Serializable {

  /**
   * Returns the creation date of the object.
   *
   * @return the creation data
   */
  Date getCreated();

  /**
   * Returns the modification date of the object.
   *
   * @return the modification date
   */
  Date getModified();

  /**
   * Returns the deletion date of this object.
   *
   * @return the deletion date
   */
  Date getDeleted();
}
