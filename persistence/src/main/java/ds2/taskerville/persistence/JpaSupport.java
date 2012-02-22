package ds2.taskerville.persistence;

import ds2.taskerville.api.PersistableObject;
import javax.persistence.EntityManager;

/**
 * Class to help with some JPA operations.
 *
 * @author kaeto23
 * @version 1.0
 */
public class JpaSupport {

  /**
   * Creates an entity.
   *
   * @param <E>
   * @param em
   * @param e
   * @return
   */
  public static <E extends PersistableObject> E storeEntity(EntityManager em,
      E e) {
    E rc = e;
    em.persist(e);
    return rc;
  }

  public static <E extends PersistableObject> boolean deleteEntity(
      EntityManager em, E e) {
    em.remove(e);
    return true;
  }

  public static <E extends PersistableObject> E findById(EntityManager em,
      Class<E> c, long id) {
    E rc = null;
    rc = em.find(c, id);
    return rc;
  }

  public static <E extends PersistableObject> E updateEntity(
      EntityManager em, E e) {
    E rc = e;
    rc = em.merge(rc);
    return rc;
  }
}
