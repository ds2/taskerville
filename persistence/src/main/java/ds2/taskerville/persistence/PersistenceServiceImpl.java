/**
 * 
 */
package ds2.taskerville.persistence;

import javax.persistence.EntityManager;

import com.google.inject.Singleton;

import ds2.taskerville.persistence.api.PersistableObject;
import ds2.taskerville.persistence.api.PersistenceService;

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
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends PersistableObject> E updateObject(E e) {
		return JpaSupport.updateEntity(em, e);
	}

}
