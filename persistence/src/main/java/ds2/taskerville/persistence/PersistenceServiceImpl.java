/**
 *
 */
package ds2.taskerville.persistence;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ds2.taskerville.api.PersistableObject;
import ds2.taskerville.persistence.api.PersistenceService;

/**
 * The basic implementation of the persistence service.
 *
 * @author kaeto23
 * @version 1.0
 */
@Stateless(name = "PersistenceService")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@TransactionManagement(TransactionManagementType.CONTAINER)
public class PersistenceServiceImpl implements PersistenceService {

  /**
   * The entity manager to use.
   */
  @PersistenceContext(unitName = "taskervillePU")
  private EntityManager em;

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
