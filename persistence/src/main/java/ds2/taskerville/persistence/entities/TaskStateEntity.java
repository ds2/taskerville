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
 * 
 * @author kaeto23
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
    
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(generator = "taskStateGen", strategy = GenerationType.TABLE)
    private long id;
    @ManyToMany(targetEntity = TaskPropertyEntity.class)
    @JoinTable(
        name = "TSK_J_TASKSTATE_TASKPROPERTY",
        joinColumns = @JoinColumn(name = "taskstate_id"),
        inverseJoinColumns = @JoinColumn(name = "property_id"))
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
