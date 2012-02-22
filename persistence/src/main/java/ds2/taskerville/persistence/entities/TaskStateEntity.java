/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.persistence.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import ds2.taskerville.api.TaskProperty;
import ds2.taskerville.api.flow.TaskState;

/**
 * 
 * @author kaeto23
 */
@Entity(name = "taskState")
@Table(name = "TSK_TASKSTATE")
public class TaskStateEntity implements TaskState {
    
    private static final long serialVersionUID = 1L;
    @Id
    private long id;
    @Transient
    private List<TaskProperty> requiredProperties;
    @Column(name = "title")
    private String stateTitle;
    @Column(name = "descr")
    private String stateDescription;
    
    @Override
    public String getStateTitle() {
        return stateTitle;
    }
    
    @Override
    public String getStateDescription() {
        return stateDescription;
    }
    
    @Override
    public List<TaskProperty> getRequiredProperties() {
        return requiredProperties;
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    /**
     * @param id
     *            the id to set
     */
    public synchronized void setId(long id) {
        this.id = id;
    }
    
    /**
     * @param requiredProperties
     *            the requiredProperties to set
     */
    public synchronized void setRequiredProperties(
        List<TaskProperty> requiredProperties) {
        this.requiredProperties = requiredProperties;
    }
    
    /**
     * @param stateTitle
     *            the stateTitle to set
     */
    public synchronized void setStateTitle(String stateTitle) {
        this.stateTitle = stateTitle;
    }
    
    /**
     * @param stateDescription
     *            the stateDescription to set
     */
    public synchronized void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }
}
