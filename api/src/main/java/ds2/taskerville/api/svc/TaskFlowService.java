/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.api.svc;

import ds2.taskerville.api.flow.TaskFlow;

/**
 *
 * @author kaeto23
 */
public interface TaskFlowService {

  /**
   * Creates a flow instance.
   *
   * @param name the name of the flow
   * @return the created flow
   */
  TaskFlow createFlow(String name);
}
