/**
 *
 */
package ds2.taskerville.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.StateAware;
import java.io.Serializable;

/**
 * @author kaeto23
 *
 */
@Embeddable
public class StateAwareEmbed implements StateAware {

  private static final long serialVersionUID = 1L;
  /**
   * The state id.
   */
  @Column(name = "state_id", updatable = true, nullable = false)
  private int stateId;
  /**
   * The entry state.
   */
  @Transient
  private EntryStates state;

  /**
   *
   */
  public StateAwareEmbed() {
    state = EntryStates.Initial;
    stateId = state.getStateId();
  }

  /**
   * Sets the entry state.
   *
   * @param s the new entry state
   */
  @Override
  public void setEntryState(EntryStates s) {
    stateId = s.getStateId();
    state = s;
  }

  /**
   * Returns the entry state.
   *
   * @return the entry state
   */
  @Override
  public EntryStates getEntryState() {
    if (state == null) {
      state = EntryStates.getById(stateId);
    }
    return state;
  }

  /*
   * (non-Javadoc) @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("EntryStateEmbeddable (stateId=");
    builder.append(stateId);
    builder.append(", ");
    if (state != null) {
      builder.append("state=");
      builder.append(state);
    }
    builder.append(")");
    return builder.toString();
  }
}
