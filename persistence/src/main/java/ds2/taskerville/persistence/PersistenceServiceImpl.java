/**
 *
 */
package ds2.taskerville.persistence;

import javax.persistence.EntityManager;


import ds2.taskerville.persistence.api.PersistableObject;
import ds2.taskerville.persistence.api.PersistenceService;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * The basic implementation of the persistence service.
 *
 * @author kaeto23
 * @version 1.0
 */
@Singleton
public class PersistenceServiceImpl implements PersistenceService {

  /**
   * The entity manager to use.
   */
  @Inject
  private EntityManager em = null;

  /**
   * {@inheritDoc}
   */
  @Override
  public <E extends PersistableObject> boolean deleteObject(E e) {
    return JpaSupport.deleteEntity(em, e);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <E extends PersistableObject> E findById(Class<E> c, long id) {
    return JpaSupport.findById(em, c, id);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <E extends PersistableObject> E persistObject(E e) {
    return JpaSupport.storeEntity(em, e);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <E extends PersistableObject> E updateObject(E e) {
    return JpaSupport.updateEntity(em, e);
  }
}
