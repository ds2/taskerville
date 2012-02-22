/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.persistence.entities;

import ds2.taskerville.api.*;
import ds2.taskerville.api.flow.TaskState;
import ds2.taskerville.api.processmanagement.ProcessState;
import ds2.taskerville.api.processmanagement.Schedule;
import ds2.taskerville.api.release.TargetRelease;
import ds2.taskerville.api.user.Recipient;
import ds2.taskerville.api.user.User;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kaeto23
 */
@Entity(name = "task")
@Table(name = "TSK_TASK")
public class TaskEntity implements Task {

  /**
   * The svuid.
   */
  private static final long serialVersionUID = 1L;
  @Id
  private long id;

  @Override
  public List<TargetRelease> getAffectedReleases() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public List<Component> getAffectedSubComponents() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public List<Recipient> getAssignees() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public List<Attachment> getAttachments() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public List<Comment> getComments() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Date getCompleted() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Date getCreated() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public User getCreator() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Date getDeleted() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public String getDescription() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public EntryStates getEntryState() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public WorkPackage getEstimation() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Date getModified() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Priority getPriority() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public ProcessState getProcessState() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Project getProject() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public long getProjectTaskId() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public List<TaskProperty> getProperties() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public List<Reference> getReferences() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Schedule getSchedule() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Solutions getSolution() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public TaskState getState() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public List<String> getTags() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public List<TargetRelease> getTargetReleases() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public String getTitle() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public TaskType getType() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public List<User> getWatchers() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public List<WorkLog> getWorkLogs() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public long getId() {
    return id;
  }
}
