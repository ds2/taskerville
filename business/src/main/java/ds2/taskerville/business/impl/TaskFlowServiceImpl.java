/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.business.impl;

import ds2.taskerville.api.flow.TaskFlow;
import ds2.taskerville.api.svc.TaskFlowService;
import ds2.taskerville.api.util.ConverterService;
import ds2.taskerville.persistence.api.PersistenceService;
import ds2.taskerville.persistence.entities.TaskFlowEntity;
import javax.inject.Inject;

/**
 * The implementation for the task flow modelling.
 *
 * @author kaeto23
 */
public class TaskFlowServiceImpl implements TaskFlowService {

  /**
   * database service.
   */
  @Inject
  private PersistenceService db;
  /**
   * A dto converter.
   */
  @Inject
  private ConverterService conv;

  @Override
  public TaskFlow createFlow(String name) {
    TaskFlowEntity t = new TaskFlowEntity();
    t.setName(name);
    t = db.persistObject(t);
    return conv.toTaskFlow(t);
  }
}
