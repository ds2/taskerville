/**
 *
 */
package ds2.taskerville.persistence.api;

import javax.persistence.EntityManager;

import ds2.taskerville.persistence.PersistenceServiceImpl;

/**
 * A service for managing database entities.
 *
 * @author kaeto23
 * @version 1.0
 */
public interface PersistenceService {

  /**
   * Persists a given object.
   *
   * @param <E> the type to persist
   * @param e the object to persist
   * @return the updated object, or null in case of an error.
   */
  <E extends PersistableObject> E persistObject(E e);

  /**
   * Finds an entity using its private key id.
   *
   * @param <E> the persistence type
   * @param c the class of the entity
   * @param id the id of the entity
   * @return null if nothing was found, or the found entity
   */
  <E extends PersistableObject> E findById(Class<E> c, long id);

  /**
   * Deletes a given entity.
   *
   * @param <E> the entity type
   * @param e the entity to delete
   * @return TRUE if successful, otherwise FALSE
   */
  <E extends PersistableObject> boolean deleteObject(E e);

  /**
   * Updates the given entity. Usually, a merge is done using the given entity.
   *
   * @param <E> the entity type
   * @param e the entity to update
   * @return null if an error occurred, otherwise the updated entity
   */
  <E extends PersistableObject> E updateObject(E e);
}
