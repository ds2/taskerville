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
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.Priority;

/**
 * The priorities of a task.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "priority")
@Table(name = "TSK_PRIORITY")
@TableGenerator(
    name = "prioGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "priority")
public class PriorityEntity implements Priority {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = -5029249773368488368L;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(generator = "prioGen", strategy = GenerationType.TABLE)
    private long id;
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
     * The time.
     */
    @Embedded
    private TimeAwareEmbed time;
    /**
     * The weight.
     */
    @Column(name = "weight", nullable = false)
    private float weight;
    
    /**
     * Inits the entity.
     */
    public PriorityEntity() {
        time = new TimeAwareEmbed();
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
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Priority o) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.Priority#getTitle()
     */
    @Override
    public String getTitle() {
        return title;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.Priority#getDescription()
     */
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public Date getCreated() {
        return time.getCreated();
    }
    
    @Override
    public Date getModified() {
        return time.getModified();
    }
    
    @Override
    public Date getDeleted() {
        return time.getDeleted();
    }
    
    @Override
    public void setDeleted(Date d) {
        time.setDeleted(d);
    }
    
    @Override
    public void touchModified() {
        time.touchModified();
    }
    
    @Override
    public float getWeight() {
        return weight;
    }
    
}