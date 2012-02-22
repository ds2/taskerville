/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.persistence.entities;

import ds2.taskerville.api.flow.NextStatePolicy;
import ds2.taskerville.api.flow.TaskState;
import ds2.taskerville.api.user.Recipient;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kaeto23
 */
@Entity(name = "nextStatePolicy")
@Table(name = "TSK_NEXTSTATE")
public class NextStatePolicyEntity implements NextStatePolicy {

  private static final long serialVersionUID = 1L;
  @Id
  private long id;

  @Override
  public TaskState getCurrentState() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public TaskState getNextState() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public String getSwitchTitle() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public List<Recipient> getRequiredAuthorities() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public long getId() {
    return id;
  }
}
