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

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.TaskProperty;
import ds2.taskerville.api.TaskPropertyValue;

/**
 * The task property value entity.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "taskPropertyValue")
@Table(name = "TSK_TASKPROPERTYVALUE")
@TableGenerator(
    name = "propValGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "taskPropertyValue")
public class TaskPropertyValueEntity implements TaskPropertyValue {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 1650408815442784793L;
    /**
     * The time.
     */
    @Embedded
    private TimeAwareEmbed time;
    /**
     * The state.
     */
    @Embedded
    private StateAwareEmbed state;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(generator = "propValGen", strategy = GenerationType.TABLE)
    private long id;
    /**
     * The property.
     */
    @ManyToOne(targetEntity = TaskPropertyEntity.class)
    @JoinColumn(name = "property_id", nullable = false)
    private TaskProperty property;
    /**
     * The value.
     */
    @Column(name = "value")
    private String value;
    
    /**
     * Inits the entity.
     */
    public TaskPropertyValueEntity() {
        time = new TimeAwareEmbed();
        state = new StateAwareEmbed();
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TimeAware#getCreated()
     */
    @Override
    public Date getCreated() {
        return time.getCreated();
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TimeAware#getModified()
     */
    @Override
    public Date getModified() {
        return time.getModified();
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TimeAware#getDeleted()
     */
    @Override
    public Date getDeleted() {
        return time.getDeleted();
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TimeAware#setDeleted(java.util.Date)
     */
    @Override
    public void setDeleted(Date d) {
        time.setDeleted(d);
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TimeAware#touchModified()
     */
    @Override
    public void touchModified() {
        time.touchModified();
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.PersistableObject#getId()
     */
    @Override
    public long getId() {
        return id;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.StateAware#getEntryState()
     */
    @Override
    public EntryStates getEntryState() {
        return state.getEntryState();
    }
    
    /*
     * (non-Javadoc)
     * @see
     * ds2.taskerville.api.StateAware#setEntryState(ds2.taskerville.api.EntryStates
     * )
     */
    @Override
    public void setEntryState(EntryStates s) {
        state.setEntryState(s);
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TaskPropertyValue#getProperty()
     */
    @Override
    public TaskProperty getProperty() {
        return property;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TaskPropertyValue#getValue()
     */
    @Override
    public String getValue() {
        return value;
    }
    
}
