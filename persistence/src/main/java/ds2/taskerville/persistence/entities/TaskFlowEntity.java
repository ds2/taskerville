/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.persistence.entities;

import ds2.taskerville.api.Project;
import ds2.taskerville.api.flow.TaskFlow;
import ds2.taskerville.api.flow.TaskState;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author kaeto23
 */
@Entity(name = "taskFlow")
@Table(name = "TSK_FLOW")
public class TaskFlowEntity implements TaskFlow {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @ManyToOne(targetEntity = ProjectEntity.class)
  @JoinTable(name = "TSK_J_FLOWPROJECT", joinColumns =
  @JoinColumn(name = "FLOW_ID"),
  inverseJoinColumns =
  @JoinColumn(name = "PROJECT_ID"))
  private Project project;

  @Override
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (int) id;
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof TaskFlowEntity)) {
      return false;
    }
    TaskFlowEntity other = (TaskFlowEntity) object;
    if (this.id != other.id) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "ds2.taskerville.persistence.entities.TaskFlowEntity[ id=" + id + " ]";
  }

  @Override
  public String getName() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public TaskState getStartState() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Project getProject() {
    return project;
  }
}
