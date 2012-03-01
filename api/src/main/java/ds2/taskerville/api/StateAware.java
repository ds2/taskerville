/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.api;

import java.io.Serializable;

/**
 * A contract for an object that may change state during life time.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface StateAware extends Serializable {
    
    /**
     * Returns the state of the object.
     * 
     * @return the state
     */
    EntryStates getEntryState();
    
    /**
     * Sets a new state for this object.
     * 
     * @param s
     *            the new state to set
     */
    void setEntryState(EntryStates s);
}
