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
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.ProjectCategory;
import ds2.taskerville.api.user.HostingSpace;
import ds2.taskerville.api.user.Team;
import ds2.taskerville.api.user.User;

/**
 * The entity for the hosting space.
 * 
 * @author dstrauss
 * @version 0.1
 * 
 */
@Entity(name = "hostingSpace")
@Table(name = "TSK_HOSTINGSPACE")
@TableGenerator(
    name = "spaceGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "hostingSpace")
public class HostingSpaceEntity implements HostingSpace {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = -3530810480980031127L;
    /**
     * The categories for this space.
     */
    @OneToMany(targetEntity = ProjectCategoryEntity.class)
    @JoinTable(
        name = "TSK_J_HOSTINGSPACE_PROJECTCATEGORY",
        joinColumns = @JoinColumn(name = "SPACE_ID"),
        inverseJoinColumns = @JoinColumn(name = "PROJECTCATEGORY_ID"))
    private List<ProjectCategory> categories;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "spaceGen")
    private long id;
    /**
     * The name of the space.
     */
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    /**
     * The state embeddable.
     */
    @Embedded
    private final StateAwareEmbed state;
    /**
     * The teams that belong to this space.
     */
    @OneToMany(targetEntity = TeamEntity.class)
    @JoinTable(name = "TSK_J_HOSTINGSPACE_TEAMS", joinColumns = @JoinColumn(
        name = "SPACE_ID"), inverseJoinColumns = @JoinColumn(name = "TEAM_ID"))
    private List<Team> teams;
    /**
     * The time embeddable.
     */
    @Embedded
    private final TimeAwareEmbed time;
    /**
     * The users who belong to this space.
     */
    @OneToMany(targetEntity = UserEntity.class)
    @JoinTable(name = "TSK_J_HOSTINGSPACE_USERS", joinColumns = @JoinColumn(
        name = "SPACE_ID"), inverseJoinColumns = @JoinColumn(name = "USER_ID"))
    private List<User> users;
    
    /**
     * Inits the entity.
     */
    public HostingSpaceEntity() {
        state = new StateAwareEmbed();
        time = new TimeAwareEmbed();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<ProjectCategory> getCategories() {
        return categories;
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
    public final Date getDeleted() {
        return time.getDeleted();
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
    public final long getId() {
        return id;
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
    public final String getName() {
        return name;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<Team> getTeams() {
        return teams;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<User> getUsers() {
        return users;
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
    public final void setEntryState(final EntryStates s) {
        state.setEntryState(s);
    }
    
    /**
     * Sets the name of the space.
     * 
     * @param n
     *            the name to set
     */
    public final synchronized void setName(final String n) {
        name = n;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("HostingSpaceEntity (id=");
        builder.append(id);
        builder.append(", ");
        if (name != null) {
            builder.append("name=");
            builder.append(name);
            builder.append(", ");
        }
        if (users != null) {
            builder.append("users=");
            builder.append(users);
            builder.append(", ");
        }
        if (teams != null) {
            builder.append("teams=");
            builder.append(teams);
            builder.append(", ");
        }
        if (categories != null) {
            builder.append("categories=");
            builder.append(categories);
            builder.append(", ");
        }
        if (state != null) {
            builder.append("state=");
            builder.append(state);
        }
        builder.append(")");
        return builder.toString();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void touchModified() {
        time.touchModified();
    }
}
