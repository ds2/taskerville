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
