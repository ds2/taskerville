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
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.user.HostingSpace;
import ds2.taskerville.api.user.Team;
import ds2.taskerville.api.user.User;
import ds2.taskerville.api.user.UserRole;

/**
 * 
 * @author kaeto23
 */
@Entity(name = "team")
@Table(name = "TSK_TEAM")
@TableGenerator(
    name = "teamGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "team")
public class TeamEntity implements Team {
    
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(generator = "teamGen", strategy = GenerationType.TABLE)
    private long id;
    private static final long serialVersionUID = 1L;
    @Embedded
    private RecipientEmbeddable recipient;
    @ManyToOne(targetEntity = UserEntity.class)
    @JoinColumn(name = "teamleader_id", nullable = true, updatable = true)
    private User teamLeader;
    @Transient
    private List<Team> subTeams;
    @Transient
    private List<User> members;
    
    @Override
    public List<User> getMembers() {
        return members;
    }
    
    @Override
    public List<Team> getSubTeams() {
        return subTeams;
    }
    
    @Override
    public User getTeamLeader() {
        return teamLeader;
    }
    
    @Override
    public List<User> getUsersOfRole(UserRole r) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String getEmailAddress() {
        return recipient.getEmailAddress();
    }
    
    @Override
    public String getName() {
        return recipient.getName();
    }
    
    @Override
    public Attachment getProfilePhoto() {
        return recipient.getProfilePhoto();
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public HostingSpace getHostingSpace() {
        return recipient.getHostingSpace();
    }
    
    @Override
    public EntryStates getEntryState() {
        return recipient.getEntryState();
    }
    
    @Override
    public void setEntryState(EntryStates s) {
        recipient.setEntryState(s);
    }
}
