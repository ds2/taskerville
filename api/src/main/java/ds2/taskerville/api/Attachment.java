/**
 *
 */
package ds2.taskerville.api;

import java.util.Date;

import javax.activation.MimeType;

/**
 * A file attachment to a task. Usually screenshots, or documents. Whatever you
 * need.
 *
 * @author kaeto23
 *
 */
public interface Attachment extends PersistableObject {

  Date getUploadDate();

  /**
   * @deprecated Use the attachment service to get the byte stream of the
   * attachment.
   * @return
   */
  @Deprecated
  byte[] getContent();

  MimeType getType();

  String getFileName();

  String getVersion();

  String getDescription();
}
