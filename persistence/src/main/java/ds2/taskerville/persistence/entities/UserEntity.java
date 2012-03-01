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
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.user.HostingSpace;
import ds2.taskerville.api.user.Team;
import ds2.taskerville.api.user.User;
import ds2.taskerville.api.user.UserRole;

/**
 * @author kaeto23
 * 
 */
@Entity
@Table(name = "TSK_USERS")
@TableGenerator(
    name = "userGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "user")
public class UserEntity implements User {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 3724949878431763324L;
    @Id
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    @GeneratedValue(generator = "userGen", strategy = GenerationType.TABLE)
    private long id;
    @Embedded
    private RecipientEmbeddable recipient;
    @ManyToMany(targetEntity = TeamEntity.class)
    @JoinTable(name = "TSK_J_USER_TEAM", joinColumns = @JoinColumn(
        name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "TEAM_ID"))
    private List<Team> memberTeams;
    @ManyToMany(targetEntity = UserRoleEntity.class)
    @JoinTable(name = "TSK_J_USER_ROLE", joinColumns = @JoinColumn(
        name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private List<UserRole> roles;
    
    /**
     * {@inheritDoc}
     */
    @Override
    public long getId() {
        return id;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.user.User#getMemberTeams()
     */
    @Override
    public List<Team> getMemberTeams() {
        return memberTeams;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.user.User#getRoles()
     */
    @Override
    public List<UserRole> getRoles() {
        return roles;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.user.Recipient#getEmailAddress()
     */
    @Override
    public String getEmailAddress() {
        return recipient.getEmailAddress();
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.user.Recipient#getName()
     */
    @Override
    public String getName() {
        return recipient.getName();
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.user.Recipient#getProfilePhoto()
     */
    @Override
    public Attachment getProfilePhoto() {
        return recipient.getProfilePhoto();
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
