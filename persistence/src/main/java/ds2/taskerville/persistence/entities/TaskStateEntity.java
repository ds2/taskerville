/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.persistence.entities;

import ds2.taskerville.api.TaskProperty;
import ds2.taskerville.api.flow.TaskState;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author kaeto23
 */
@Entity(name = "taskState")
@Table(name = "TSK_TASKSTATE")
public class TaskStateEntity implements TaskState {

  private static final long serialVersionUID = 1L;
  @Id
  private long id;
  @ManyToMany(targetEntity = TaskPropertyEntity.class)
  @JoinTable(name = "TSK_J_STATE_PROPERTY", joinColumns = {
    @JoinColumn(name = "id", referencedColumnName = "")})
  private List<TaskProperty> requiredProperties;

  @Override
  public String getStateTitle() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public String getStateDescription() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public List<TaskProperty> getRequiredProperties() {
    return requiredProperties;
  }

  @Override
  public long getId() {
    return id;
  }
}
