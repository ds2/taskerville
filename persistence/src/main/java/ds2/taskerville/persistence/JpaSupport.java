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
 * @author kaeto23
 * @version 1.0
 */
public class JpaSupport {
    
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
