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
package ds2.taskerville.persistence.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.TaskProperty;
import ds2.taskerville.api.flow.TaskState;

/**
 * The task state entity.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "taskState")
@Table(name = "TSK_TASKSTATE")
@TableGenerator(
    name = "taskStateGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "taskState")
public class TaskStateEntity implements TaskState {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 1L;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(generator = "taskStateGen", strategy = GenerationType.TABLE)
    private long id;
    /**
     * The required properties.
     */
    @ManyToMany(targetEntity = TaskPropertyEntity.class)
    @JoinTable(
        name = "TSK_J_TASKSTATE_TASKPROPERTY",
        joinColumns = @JoinColumn(name = "taskstate_id"),
        inverseJoinColumns = @JoinColumn(name = "property_id"))
    private List<TaskProperty> requiredProperties;
    /**
     * The description.
     */
    @Column(name = "descr")
    private String stateDescription;
    /**
     * The state title.
     */
    @Column(name = "title")
    private String stateTitle;
    
    @Override
    public final long getId() {
        return id;
    }
    
    @Override
    public List<TaskProperty> getRequiredProperties() {
        return requiredProperties;
    }
    
    @Override
    public String getStateDescription() {
        return stateDescription;
    }
    
    @Override
    public String getStateTitle() {
        return stateTitle;
    }
    
    /**
     * Sets the required params.
     * 
     * @param requiredProperties
     *            the requiredProperties to set
     */
    public final synchronized void setRequiredProperties(
        final List<TaskProperty> requiredProperties) {
        this.requiredProperties = requiredProperties;
    }
    
    /**
     * Sets the description.
     * 
     * @param stateDescription
     *            the stateDescription to set
     */
    public synchronized void setStateDescription(final String stateDescription) {
        this.stateDescription = stateDescription;
    }
    
    /**
     * Sets the state title.
     * 
     * @param stateTitle
     *            the stateTitle to set
     */
    public final synchronized void setStateTitle(final String stateTitle) {
        this.stateTitle = stateTitle;
    }
}
