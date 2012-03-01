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
/**
 * 
 */
package ds2.taskerville.persistence.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.TaskProperty;
import ds2.taskerville.api.TaskType;
import ds2.taskerville.api.flow.TaskFlow;

/**
 * The task types entity.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "taskType")
@Table(name = "TSK_TASKTYPE")
@TableGenerator(
    name = "taskTypeGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "taskType")
public class TaskTypeEntity implements TaskType {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 3254852477224424464L;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(generator = "taskTypeGen", strategy = GenerationType.TABLE)
    private long id;
    /**
     * The state.
     */
    @Embedded
    private StateAwareEmbed state;
    /**
     * The required properties.
     */
    @ManyToMany(targetEntity = TaskPropertyEntity.class)
    @JoinTable(name = "TSK_J_TASKTYPE_TASKPROP", joinColumns = @JoinColumn(
        name = "TASKTYPE_ID"), inverseJoinColumns = @JoinColumn(
        name = "PROP_ID"))
    private List<TaskProperty> requiredProperties;
    /**
     * The description.
     */
    @Column(name = "description")
    private String description;
    /**
     * The title.
     */
    @Column(name = "title", nullable = false)
    private String title;
    /**
     * The flow.
     */
    @OneToOne(targetEntity = TaskFlowEntity.class)
    @JoinColumn(name = "flow_id")
    private TaskFlow flow;
    
    /**
     * Inits the entity.
     */
    public TaskTypeEntity() {
        state = new StateAwareEmbed();
    }
    
    @Override
    public final long getId() {
        return id;
    }
    
    @Override
    public final EntryStates getEntryState() {
        return state.getEntryState();
    }
    
    @Override
    public final void setEntryState(final EntryStates s) {
        state.setEntryState(s);
    }
    
    @Override
    public final TaskFlow getFlow() {
        return flow;
    }
    
    @Override
    public final String getTitle() {
        return title;
    }
    
    @Override
    public final String getDescription() {
        return description;
    }
    
    @Override
    public final List<TaskProperty> getRequiredProperties() {
        return requiredProperties;
    }
    
}
