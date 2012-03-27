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
package ds2.taskerville.persistence;

import javax.persistence.EntityManager;

import ds2.taskerville.api.PersistableObject;

/**
 * Class to help with some JPA operations.
 * 
 * @author dstrauss
 * @version 0.1
 */
public final class JpaSupport {
    public static <E extends PersistableObject> boolean deleteEntity(
        final EntityManager em, final E e) {
        em.remove(e);
        return true;
    }
    
    public static <E extends PersistableObject> E findById(
        final EntityManager em, final Class<E> c, final long id) {
        E rc = null;
        rc = em.find(c, id);
        return rc;
    }
    
    /**
     * Creates an entity.
     * 
     * @param <E>
     *            the persistable type
     * @param em
     *            the entity manager
     * @param e
     *            the entity to persist
     * @return the updated entity
     */
    public static <E extends PersistableObject> E storeEntity(
        final EntityManager em, final E e) {
        final E rc = e;
        em.persist(e);
        return rc;
    }
    
    public static <E extends PersistableObject> E updateEntity(
        final EntityManager em, final E e) {
        E rc = e;
        rc = em.merge(rc);
        return rc;
    }
    
    /**
     * Would init the class.
     */
    private JpaSupport() {
        // nothing special to do
    }
}
