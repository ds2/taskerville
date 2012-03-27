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
package ds2.taskerville.persistence.api;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.PersistableObject;
import ds2.taskerville.api.StateAware;

/**
 * A service for managing database entities.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface PersistenceService {
    
    /**
     * Deletes a given entity.
     * 
     * @param <E>
     *            the entity type
     * @param e
     *            the entity to delete
     * @return TRUE if successful, otherwise FALSE
     */
    <E extends PersistableObject> boolean deleteObject(E e);
    
    /**
     * Finds an entity using its private key id.
     * 
     * @param <E>
     *            the persistence type
     * @param c
     *            the class of the entity
     * @param id
     *            the id of the entity
     * @return null if nothing was found, or the found entity
     */
    <E extends PersistableObject> E findById(Class<E> c, long id);
    
    /**
     * Persists a given object.
     * 
     * @param <E>
     *            the type to persist
     * @param e
     *            the object to persist
     * @return the updated object, or null in case of an error.
     */
    <E extends PersistableObject> E persistObject(E e);
    
    /**
     * Updates a new entry.
     * 
     * @param <E>
     *            the entity type
     * @param aClass
     *            the class of the entity
     * @param id
     *            the id of the entity
     * @param newState
     *            the new state to set
     * @return the updated entity
     */
    <E extends StateAware> E setEntryState(Class<E> aClass, long id,
        EntryStates newState);
    
    /**
     * Updates the given entity. Usually, a merge is done using the given
     * entity.
     * 
     * @param <E>
     *            the entity type
     * @param e
     *            the entity to update
     * @return null if an error occurred, otherwise the updated entity
     */
    <E extends PersistableObject> E updateObject(E e);
}
