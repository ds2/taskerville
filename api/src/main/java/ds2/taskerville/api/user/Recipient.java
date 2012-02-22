/**
 *
 */
package ds2.taskerville.api.user;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.PersistableObject;

/**
 * This is a group, a team, or a single user.
 *
 * @author kaeto23
 * @version 1.0
 */
public interface Recipient extends PersistableObject {

  /**
   * Returns the email address of the recipient.
   *
   * @return the email address
   */
  String getEmailAddress();

  /**
   * Returns the name of the recipient.
   *
   * @return the human-readable name of the recipient
   */
  String getName();

  /**
   * Returns a possible profile photo of the recipient.
   *
   * @return a profile photo, or null if not set
   */
  Attachment getProfilePhoto();

  /**
   * Returns the entry state of the recipient.
   *
   * @return the entry state
   */
  EntryStates getState();
}
