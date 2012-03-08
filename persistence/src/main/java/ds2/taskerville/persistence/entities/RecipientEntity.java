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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.user.Recipient;
import ds2.taskerville.api.user.Team;
import ds2.taskerville.api.user.User;

/**
 * The recipient entity.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "recipient")
@Table(name = "TSK_RECIPIENT")
@TableGenerator(
    name = "recipientGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "recipient")
public class RecipientEntity implements Recipient {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = -7659920615565958903L;
    /**
     * The time.
     */
    @Embedded
    private TimeAwareEmbed time;
    /**
     * The team.
     */
    @OneToOne(targetEntity = TeamEntity.class)
    @JoinColumn(name = "team_id")
    private Team team;
    /**
     * The user.
     */
    @OneToOne(targetEntity = UserEntity.class)
    @JoinColumn(name = "user_id")
    private User user;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(generator = "recipientGen", strategy = GenerationType.TABLE)
    private long id;
    
    /**
     * Inits the entity.
     */
    public RecipientEntity() {
        time = new TimeAwareEmbed();
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
     * @see ds2.taskerville.api.user.Recipient#getUser()
     */
    @Override
    public User getUser() {
        return user;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.user.Recipient#getTeam()
     */
    @Override
    public Team getTeam() {
        return team;
    }
    
}
