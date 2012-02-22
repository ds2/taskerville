/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.persistence.entities;

import ds2.taskerville.api.TaskProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kaeto23
 */
@Entity(name = "taskProperty")
@Table(name = "TSK_TASKPROPERTY")
public class TaskPropertyEntity implements TaskProperty {

  private static final long serialVersionUID = 1L;
  @Id
  private long id;

  @Override
  public String getName() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public int getTypeParserId() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public long getId() {
    return id;
  }

  @Override
  public int compareTo(TaskProperty t) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
