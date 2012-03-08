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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

import ds2.taskerville.api.Comment;
import ds2.taskerville.api.TimeAmount;
import ds2.taskerville.api.WorkLog;
import ds2.taskerville.api.user.User;

/**
 * The work log entity.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "workLog")
@Table(name = "TSK_WORKLOG")
@TableGenerator(
    name = "worklogGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "workLog")
public class WorkLogEntity implements WorkLog {
    /**
     * The time.
     */
    @Embedded
    private TimeAwareEmbed time;
    /**
     * The time spent.
     */
    @Transient
    private TimeAmount timeSpent;
    /**
     * The comment.
     */
    @OneToOne(targetEntity = CommentEntity.class)
    @JoinColumn(name = "COMMENT_ID")
    private Comment comment;
    /**
     * The worker.
     */
    @ManyToOne(targetEntity = UserEntity.class)
    @JoinColumn(name = "USER_ID")
    private User worker;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(generator = "worklogGen", strategy = GenerationType.TABLE)
    private long id;
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = -8414550892909832143L;
    
    /**
     * Inits the entity.
     */
    public WorkLogEntity() {
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
     * @see ds2.taskerville.api.WorkLog#getWorker()
     */
    @Override
    public User getWorker() {
        return worker;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.WorkLog#getComment()
     */
    @Override
    public Comment getComment() {
        return comment;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.WorkLog#getTimeSpent()
     */
    @Override
    public TimeAmount getTimeSpent() {
        return timeSpent;
    }
    
}