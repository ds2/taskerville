/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.api.svc;

import ds2.taskerville.api.flow.TaskFlow;

/**
 * The task flow service.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface TaskFlowService {
    
    /**
     * Creates a flow instance.
     * 
     * @param name
     *            the name of the flow
     * @return the created flow
     */
    TaskFlow createFlow(String name);
}
