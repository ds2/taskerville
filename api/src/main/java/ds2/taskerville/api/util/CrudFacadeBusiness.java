/**
 * 
 */
package ds2.taskerville.api.util;

import ds2.taskerville.api.PersistableObject;

/**
 * The business contract of the crud facade.
 * 
 * @author dstrauss
 * @version 0.1
 * @param <E>
 *            The entity type
 */
public interface CrudFacadeBusiness<E extends PersistableObject>
    extends
    CrudFacade<E> {
    // no special methods needed
}
