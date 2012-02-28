/**
 * 
 */
package ds2.taskerville.persistence.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.ProjectCategory;
import ds2.taskerville.api.user.HostingSpace;
import ds2.taskerville.api.user.Team;
import ds2.taskerville.api.user.User;

/**
 * The entity for the hosting space.
 * 
 * @author kaeto23
 * 
 */
@Entity(name = "hostingSpace")
@Table(name = "TSK_HOSTINGSPACE")
public class HostingSpaceEntity implements HostingSpace {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = -3530810480980031127L;
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private long id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Transient
    private List<User> users;
    @Transient
    private List<Team> teams;
    @Transient
    private List<ProjectCategory> categories;
    @Embedded
    private EntryStateEmbeddable state;
    
    /**
     * 
     */
    public HostingSpaceEntity() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public List<User> getUsers() {
        return users;
    }
    
    @Override
    public List<Team> getTeams() {
        return teams;
    }
    
    @Override
    public List<ProjectCategory> getCategories() {
        return categories;
    }
    
    @Override
    public EntryStates getState() {
        return state.getEntryState();
    }
    
}
