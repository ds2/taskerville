/**
 * 
 */
package ds2.taskerville.api;

import ds2.taskerville.api.user.User;

import java.io.Serializable;
import java.util.Date;

/**
 * A comment to a task.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface Comment extends Serializable {
	/**
	 * Returns the initial author of the comment.
	 * 
	 * @return the author
	 */
	User getAuthor();

	/**
	 * Returns the comment as a simple string. The string must be parsed
	 * considering the type of the content!
	 * 
	 * @return the comment
	 */
	String getComment();

	/**
	 * Returns the type of the comment.
	 * 
	 * @return the content type
	 */
	ContentType getContentType();

	/**
	 * Returns the creation date.
	 * 
	 * @return the creation date
	 */
	Date getCreated();

	/**
	 * Returns the deletion date.
	 * 
	 * @return the deletion date. Will return null of not yet deleted.
	 */
	Date getDeleted();

	/**
	 * Returns the editor of the comment.
	 * 
	 * @return the editor, or null if the comment has not been edited yet.
	 */
	User getEditor();

	/**
	 * Returns the modification date.
	 * 
	 * @return the modification date
	 */
	Date getModified();

	/**
	 * Returns the state of the entry.
	 * 
	 * @return the state of the entry
	 */
	EntryStates getState();
}
