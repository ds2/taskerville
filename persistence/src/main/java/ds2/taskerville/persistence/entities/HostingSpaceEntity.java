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
import javax.persistence.Table;
import javax.persistence.TableGenerator;
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
@TableGenerator(name = "tableGen1", allocationSize = 5, initialValue = 1)
public class HostingSpaceEntity implements HostingSpace {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = -3530810480980031127L;
    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tableGen1")
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
        state = new EntryStateEmbeddable();
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
    
    /**
     * @param name
     *            the name to set
     */
    public synchronized void setName(String name) {
        this.name = name;
    }
    
    /**
     * @param state
     *            the state to set
     */
    public synchronized void setState(EntryStates state) {
        this.state.setEntryState(state);
    }
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
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
    
}
