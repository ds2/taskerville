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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.business.impl;

import javax.inject.Inject;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.svc.HostingSpaceService;
import ds2.taskerville.api.user.HostingSpace;
import ds2.taskerville.api.util.ConverterService;
import ds2.taskerville.persistence.api.PersistenceService;
import ds2.taskerville.persistence.entities.HostingSpaceEntity;

/**
 * A way to deal with the hosting spaces.
 * 
 * @author dstrauss
 * @version 0.1
 */
public class HostingSpaceServiceImpl implements HostingSpaceService {
    /**
     * The persistence service.
     */
    @Inject
    private PersistenceService db;
    /**
     * The dto converter.
     */
    @Inject
    private ConverterService conv;
    
    /**
     * Inits the bean.
     */
    public HostingSpaceServiceImpl() {
        // nothing special to do
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final HostingSpace createSpace(final String name) {
        HostingSpaceEntity e = new HostingSpaceEntity();
        e.setName(name);
        e = db.persistObject(e);
        return conv.toHostingSpace(e);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final HostingSpace getSpaceById(final long spaceId) {
        final HostingSpaceEntity e =
            db.findById(HostingSpaceEntity.class, spaceId);
        return conv.toHostingSpace(e);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final HostingSpace setSpaceState(final long spaceId,
        final EntryStates newState) {
        final HostingSpaceEntity e =
            db.setEntryState(HostingSpaceEntity.class, spaceId, newState);
        return conv.toHostingSpace(e);
    }
}
