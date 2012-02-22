/**
 *
 */
package ds2.taskerville.api;

import java.io.Serializable;

/**
 * A type of a reference between two tasks. This can be something like
 * DUPLICATE, SUBTASK or something like that.
 *
 * @author kaeto23
 *
 */
public interface ReferenceType extends PersistableObject {

  String getTitle();

  String getOppositeTitle();
}
