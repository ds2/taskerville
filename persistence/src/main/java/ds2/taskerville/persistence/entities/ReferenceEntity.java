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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.UniqueConstraint;

import ds2.taskerville.api.Reference;
import ds2.taskerville.api.ReferenceType;
import ds2.taskerville.api.Task;
import ds2.taskerville.api.flow.TaskState;

/**
 * A reference table entity.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "reference")
@Table(name = "TSK_REFERENCE", uniqueConstraints = @UniqueConstraint(
    columnNames = { "origin_task", "ref_task" }))
@TableGenerator(
    name = "refGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "reference")
public class ReferenceEntity implements Reference {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = -5845596535978625086L;
    /**
     * The time.
     */
    @Embedded
    private TimeAwareEmbed time;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(generator = "refGen", strategy = GenerationType.TABLE)
    private long id;
    /**
     * The referenced task.
     */
    @ManyToOne(targetEntity = TaskEntity.class)
    @JoinColumn(name = "ref_task", nullable = false)
    private Task referencedTask;
    /**
     * The origin task.
     */
    @ManyToOne(targetEntity = TaskEntity.class)
    @JoinColumn(name = "origin_task", nullable = false)
    private Task originalTask;
    /**
     * The reference type of these two tasks.
     */
    @ManyToOne(targetEntity = ReferenceTypeEntity.class)
    @JoinColumn(name = "type_id", nullable = false)
    private ReferenceType referenceType;
    /**
     * The required referenced task state.
     */
    @ManyToOne(targetEntity = TaskStateEntity.class)
    @JoinColumn(name = "req_ref_state")
    private TaskState requiredReferenceState;
    
    /**
     * Inits the entity.
     */
    public ReferenceEntity() {
        // TODO Auto-generated constructor stub
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
     * @see ds2.taskerville.api.Reference#getReferencedTask()
     */
    @Override
    public Task getReferencedTask() {
        return referencedTask;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.Reference#getOriginalTask()
     */
    @Override
    public Task getOriginalTask() {
        return originalTask;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.Reference#getReferenceType()
     */
    @Override
    public ReferenceType getReferenceType() {
        return referenceType;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.Reference#getRequiredReferenceState()
     */
    @Override
    public TaskState getRequiredReferenceState() {
        return requiredReferenceState;
    }
    
}
