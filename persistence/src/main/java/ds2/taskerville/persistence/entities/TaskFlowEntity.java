/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.persistence.entities;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.Project;
import ds2.taskerville.api.flow.TaskFlow;
import ds2.taskerville.api.flow.TaskState;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 *
 * @author kaeto23
 */
@Entity(name = "taskFlow")
@Table(name = "TSK_FLOW")
@TableGenerator(name = "taskFlowGen", table = "TSK_ID", valueColumnName = "next", pkColumnName = "pk", pkColumnValue = "taskFlow")
public class TaskFlowEntity implements TaskFlow {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = "taskFlowGen")
  private long id;
  @ManyToOne(targetEntity = ProjectEntity.class)
  @JoinTable(name = "TSK_J_FLOWPROJECT", joinColumns =
  @JoinColumn(name = "FLOW_ID"),
  inverseJoinColumns =
  @JoinColumn(name = "PROJECT_ID"))
  private Project project;
  @Embedded
  private TimeAwareEmbed time;
  @Embedded
  private StateAwareEmbed entryState;
  @Column(name = "name", nullable = false)
  private String name;
  @ManyToOne(targetEntity = TaskStateEntity.class)
  @JoinColumn(name = "start_state_id")
  private TaskState startState;

  public TaskFlowEntity() {
    time = new TimeAwareEmbed();
    entryState = new StateAwareEmbed();
  }

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
    return name;
  }

  @Override
  public TaskState getStartState() {
    return startState;
  }

  @Override
  public Project getProject() {
    return project;
  }

  @Override
  public Date getCreated() {
    return time.getCreated();
  }

  @Override
  public Date getModified() {
    return time.getModified();
  }

  @Override
  public Date getDeleted() {
    return time.getDeleted();
  }

  @Override
  public EntryStates getEntryState() {
    return entryState.getEntryState();
  }

  @Override
  public void setEntryState(EntryStates s) {
    entryState.setEntryState(s);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public void setStartState(TaskState startState) {
    this.startState = startState;
  }
}
