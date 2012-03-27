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

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.PersistableObject;
import ds2.taskerville.api.StateAware;
import ds2.taskerville.persistence.api.PersistenceService;

/**
 * The basic implementation of the persistence service.
 * 
 * @author dstrauss
 * @version 0.1
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
     * Inits the bean.
     */
    public PersistenceServiceImpl() {
        // nothing special to do
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final <E extends PersistableObject> boolean deleteObject(final E e) {
        return JpaSupport.deleteEntity(em, e);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final <E extends PersistableObject> E findById(final Class<E> c,
        final long id) {
        return JpaSupport.findById(em, c, id);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final <E extends PersistableObject> E persistObject(final E e) {
        return JpaSupport.storeEntity(em, e);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final <E extends StateAware> E setEntryState(final Class<E> aClass,
        final long id, final EntryStates newState) {
        final E ent = JpaSupport.findById(em, aClass, id);
        if (ent == null) {
            return null;
        }
        final StateAware s = ent;
        s.setEntryState(newState);
        return JpaSupport.updateEntity(em, ent);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final <E extends PersistableObject> E updateObject(final E e) {
        return JpaSupport.updateEntity(em, e);
    }
}
