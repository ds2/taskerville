/**
 * 
 */
package ds2.taskerville.ejb;

import javax.persistence.EntityManager;

import ds2.taskerville.persistence.api.PersistableObject;
import ds2.taskerville.persistence.api.PersistenceService;

/**
 * @author kaeto23
 * 
 */
public class PersistenceServiceBean implements PersistenceService {
	private EntityManager em;
	private PersistenceService svc = null;

	/**
	 * 
	 */
	public PersistenceServiceBean() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeds2.taskerville.persistence.api.PersistenceService#deleteObject(ds2.
	 * taskerville.persistence.api.PersistableObject)
	 */
	@Override
	public <E extends PersistableObject> boolean deleteObject(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ds2.taskerville.persistence.api.PersistenceService#findById(java.lang
	 * .Class, long)
	 */
	@Override
	public <E extends PersistableObject> E findById(Class<E> c, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ds2.taskerville.persistence.api.PersistenceService#persistObject(ds2.
	 * taskerville.persistence.api.PersistableObject)
	 */
	@Override
	public <E extends PersistableObject> E persistObject(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeds2.taskerville.persistence.api.PersistenceService#updateObject(ds2.
	 * taskerville.persistence.api.PersistableObject)
	 */
	@Override
	public <E extends PersistableObject> E updateObject(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEntityManager(EntityManager em) {
		// ignored
	}

}
