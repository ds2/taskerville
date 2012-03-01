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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

import ds2.taskerville.api.flow.NextStatePolicy;
import ds2.taskerville.api.flow.TaskFlow;
import ds2.taskerville.api.flow.TaskState;
import ds2.taskerville.api.user.Recipient;
import ds2.taskerville.api.user.Team;
import ds2.taskerville.api.user.User;

/**
 * 
 * The nextState policy entity.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "nextStatePolicy")
@Table(name = "TSK_NEXTSTATE")
@TableGenerator(
    name = "nextStateGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "nextState")
public class NextStatePolicyEntity implements NextStatePolicy {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 1L;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(generator = "nextStateGen", strategy = GenerationType.TABLE)
    private long id;
    /**
     * The origin flow.
     */
    @ManyToOne(targetEntity = TaskFlowEntity.class)
    @JoinTable(name = "TSK_J_POLICY_FLOW", joinColumns = @JoinColumn(
        name = "POLICY_ID"), inverseJoinColumns = @JoinColumn(name = "FLOW_ID"))
    private TaskFlow flow;
    /**
     * The required recipients.
     */
    @Transient
    private List<Recipient> requiredAuthorities;
    /**
     * the switch title.
     */
    @Column(name = "title", nullable = false)
    private String switchTitle;
    /**
     * The next state.
     */
    @ManyToOne(targetEntity = TaskStateEntity.class)
    @JoinColumn(name = "next_id", nullable = true)
    private TaskState nextState;
    /**
     * The current state.
     */
    @ManyToOne(targetEntity = TaskStateEntity.class)
    @JoinColumn(name = "curr_id", nullable = false)
    private TaskState currentState;
    /**
     * The authorized users.
     */
    @ManyToMany(targetEntity = UserEntity.class)
    @JoinTable(name = "TSK_J_NEXTSTATE_USERS", joinColumns = @JoinColumn(
        name = "NEXTSTATE_ID"), inverseJoinColumns = @JoinColumn(
        name = "USER_ID"))
    private List<User> requiredAuthorityUsers;
    /**
     * The authorized teams.
     */
    @ManyToMany(targetEntity = TeamEntity.class)
    @JoinTable(name = "TSK_J_NEXTSTATE_TEAMS", joinColumns = @JoinColumn(
        name = "NEXTSTATE_ID"), inverseJoinColumns = @JoinColumn(
        name = "TEAM_ID"))
    private List<Team> requiredAuthorityTeams;
    
    /**
     * Inits the entity.
     */
    public NextStatePolicyEntity() {
        // nothing to do
    }
    
    @Override
    public final TaskState getCurrentState() {
        return currentState;
    }
    
    @Override
    public final TaskState getNextState() {
        return nextState;
    }
    
    @Override
    public final String getSwitchTitle() {
        return switchTitle;
    }
    
    @Override
    public final long getId() {
        return id;
    }
    
    @Override
    public final TaskFlow getFlow() {
        return flow;
    }
    
    @Override
    public final List<User> getRequiredAuthorityUsers() {
        return requiredAuthorityUsers;
    }
    
    @Override
    public final List<Team> getRequiredAuthorityTeams() {
        return requiredAuthorityTeams;
    }
}
