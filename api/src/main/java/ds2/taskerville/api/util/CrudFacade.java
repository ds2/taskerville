/**
 * 
 */
package ds2.taskerville.api.util;

import java.util.List;

import ds2.taskerville.api.PersistableObject;

/**
 * A simple crud facade.
 * 
 * @author dstrauss
 * @version 0.1
 * @param <E>
 *            the type of the facade
 */
public interface CrudFacade<E extends PersistableObject> {
    /**
     * Get all entities.
     * 
     * @return all valid entities
     */
    List<E> getAll();
    
    /**
     * Returns the entity with the given id.
     * 
     * @param id
     *            the id
     * @return the entity, or null if not found
     */
    E getById(long id);
    
    /**
     * Returns the entity with the given name.
     * 
     * @param n
     *            the name of the entity
     * @return the found entity, or null if not found
     */
    E getByName(String n);
    
    /**
     * Updates a current exisiting entity.
     * 
     * @param id
     *            the id of the entity
     * @param delta
     *            the delta
     * @return the updated entity
     */
    E update(long id, E delta);
    
    /**
     * Deletes an entity.
     * 
     * @param id
     *            the id of the entity
     */
    void delete(long id);
}
