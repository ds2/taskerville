/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.persistence.entities;

import ds2.taskerville.api.TimeAware;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author kaeto23
 */
@Embeddable
public class TimeAwareEmbed implements TimeAware {

  /**
   * The svuid.
   */
  private static final long serialVersionUID = 1L;
  @Column(name = "created", nullable = false, updatable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date created;
  @Column(name = "modified", nullable = false, updatable = true)
  @Temporal(TemporalType.TIMESTAMP)
  private Date modified;
  @Column(name = "deleted", nullable = true, updatable = true)
  @Temporal(TemporalType.TIMESTAMP)
  private Date deleted;

  public TimeAwareEmbed() {
    created = new Date();
    modified = created;
  }

  @Override
  public Date getCreated() {
    return created;
  }

  @Override
  public Date getModified() {
    return modified;
  }

  @Override
  public Date getDeleted() {
    return deleted;
  }
}
