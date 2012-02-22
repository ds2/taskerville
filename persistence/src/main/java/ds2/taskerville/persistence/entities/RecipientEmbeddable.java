/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.persistence.entities;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.user.Recipient;
import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 *
 * @author kaeto23
 */
@Embeddable
public class RecipientEmbeddable implements Recipient {

  private static final long serialVersionUID = 1L;
  @Id
  private long id;
  private EntryStates state;
  private String emailAddress;
  private String name;
  private Attachment profilePhoto;

  @Override
  public String getEmailAddress() {
    return emailAddress;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Attachment getProfilePhoto() {
    return profilePhoto;
  }

  @Override
  public EntryStates getState() {
    return state;
  }

  @Override
  public long getId() {
    return id;
  }
}
