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

import java.net.URL;
import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.google.common.base.Objects;

import ds2.taskerville.api.Component;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.Project;
import ds2.taskerville.api.TaskType;
import ds2.taskerville.api.processmanagement.ProcessManagement;
import ds2.taskerville.api.user.HostingSpace;
import ds2.taskerville.api.user.User;

/**
 * The project entity.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "project")
@Table(name = "TSK_PROJECT")
@TableGenerator(
    name = "projectGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "taskFlow")
public class ProjectEntity implements Project {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 1L;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "projectGen")
    private long id;
    
    /**
     * The short id.
     */
    @Column(name = "short_id")
    private String shortTitle;
    /**
     * The supported task types for this project.
     */
    @ManyToMany(targetEntity = TaskTypeEntity.class)
    @JoinTable(name = "TSK_J_PROJECT_TASKTYPE", joinColumns = @JoinColumn(
        name = "PROJECT_ID"), inverseJoinColumns = @JoinColumn(
        name = "TASKTYPE_ID"))
    private List<TaskType> supportedTaskTypes;
    /**
     * The components of this project.
     */
    @OneToMany(targetEntity = ComponentEntity.class)
    @JoinTable(name = "TSK_J_PROJECT_COMPONENT", joinColumns = @JoinColumn(
        name = "PROJECT_ID"), inverseJoinColumns = @JoinColumn(
        name = "COMPONENT_ID"))
    private List<Component> subComponents;
    /**
     * The homepage.
     */
    @Column(name = "homepage")
    private URL homepage;
    /**
     * The state.
     */
    @Embedded
    private StateAwareEmbed state;
    /**
     * The hosting space.
     */
    @ManyToOne(targetEntity = HostingSpaceEntity.class)
    @JoinColumn(name = "space_id")
    private HostingSpace hostingSpace;
    /**
     * The title.
     */
    @Column(name = "title", nullable = false)
    private String title;
    /**
     * The description.
     */
    @Column(name = "description")
    private String description;
    /**
     * The lead user.
     */
    @ManyToOne(targetEntity = UserEntity.class)
    @JoinColumn(name = "leader_id")
    private User lead;
    /**
     * The time.
     */
    @Embedded
    private TimeAwareEmbed time;
    
    /**
     * Inits the entity.
     */
    public ProjectEntity() {
        time = new TimeAwareEmbed();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final long getId() {
        return id;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean equals(final Object object) {
        if (!(object instanceof ProjectEntity)) {
            return false;
        }
        final ProjectEntity other = (ProjectEntity) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final String toString() {
        return Objects.toStringHelper(ProjectEntity.class).add("id", id)
            .add("title", this.title).add("shortTitle", shortTitle)
            .add("descr", description).add("homepage", homepage)
            .add("state", state).add("space", hostingSpace).add("lead", lead)
            .add("times", time).toString();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final String getShortTitle() {
        return shortTitle;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<TaskType> getSupportedTaskTypes() {
        return supportedTaskTypes;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<Component> getSubComponents() {
        return subComponents;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final URL getHomepage() {
        return homepage;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final ProcessManagement getManagement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final EntryStates getEntryState() {
        return state.getEntryState();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final HostingSpace getHostingSpace() {
        return hostingSpace;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final String getTitle() {
        return title;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final String getDescription() {
        return description;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final User getLead() {
        return lead;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void setEntryState(final EntryStates s) {
        state.setEntryState(s);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Date getCreated() {
        return time.getCreated();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Date getModified() {
        return time.getModified();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Date getDeleted() {
        return time.getDeleted();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void setDeleted(final Date d) {
        time.setDeleted(d);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void touchModified() {
        time.touchModified();
    }
}
