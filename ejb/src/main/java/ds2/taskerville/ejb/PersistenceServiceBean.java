/*
 * TaskerVille - issue and project management
 * Copyright (C) 2012  Dirk Strauss
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 *
 */
package ds2.taskerville.ejb;

import ds2.taskerville.api.PersistableObject;
import javax.persistence.EntityManager;

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
   * @see ds2.taskerville.persistence.api.PersistenceService#findById(java.lang
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
   * @see ds2.taskerville.persistence.api.PersistenceService#persistObject(ds2.
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
}
