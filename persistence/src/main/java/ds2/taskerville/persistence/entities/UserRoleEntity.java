/**
 * 
 */
package ds2.taskerville.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.user.UserRole;

/**
 * @author Kaeto23
 * 
 */
@Entity(name = "userRole")
@Table(name = "TSK_USERROLES")
@TableGenerator(
    name = "userRoleGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "userRole")
public class UserRoleEntity implements UserRole {
    /**
     * 
     */
    private static final long serialVersionUID = 3652736272564474777L;
    @Id
    @GeneratedValue(generator = "userRoleGen", strategy = GenerationType.TABLE)
    private long id;
    @Column(name = "description")
    private String description;
    @Column(name = "title", nullable = false, updatable = true)
    private String title;
    
    /**
     * 
     */
    public UserRoleEntity() {
        // TODO Auto-generated constructor stub
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
     * @see ds2.taskerville.api.user.UserRole#getDescription()
     */
    @Override
    public String getDescription() {
        return description;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.user.UserRole#getTitle()
     */
    @Override
    public String getTitle() {
        return title;
    }
    
}
