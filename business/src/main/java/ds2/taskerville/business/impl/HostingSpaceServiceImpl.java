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

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.svc.HostingSpaceService;
import ds2.taskerville.api.user.HostingSpace;
import ds2.taskerville.api.util.ConverterService;
import ds2.taskerville.persistence.api.PersistenceService;
import ds2.taskerville.persistence.entities.HostingSpaceEntity;
import javax.inject.Inject;

/**
 *
 * @author kaeto23
 */
public class HostingSpaceServiceImpl implements HostingSpaceService {

  @Inject
  private PersistenceService db;
  @Inject
  private ConverterService conv;

  @Override
  public HostingSpace createSpace(String name) {
    HostingSpaceEntity e = new HostingSpaceEntity();
    e.setName(name);
    e = db.persistObject(e);
    return conv.toHostingSpace(e);
  }

  @Override
  public HostingSpace getSpaceById(long spaceId) {
    HostingSpaceEntity e = db.findById(HostingSpaceEntity.class, spaceId);
    return conv.toHostingSpace(e);
  }

  @Override
  public HostingSpace setSpaceState(long spaceId, EntryStates newState) {
    HostingSpaceEntity e = db.setEntryState(HostingSpaceEntity.class, spaceId, newState);
    return conv.toHostingSpace(e);
  }
}
