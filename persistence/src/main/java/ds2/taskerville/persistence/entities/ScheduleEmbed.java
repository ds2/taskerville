/**
 * 
 */
package ds2.taskerville.persistence.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import ds2.taskerville.api.processmanagement.Schedulable;

/**
 * The schedule embeddable.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Embeddable
public class ScheduleEmbed implements Schedulable {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 8159458319128155701L;
    /**
     * The start date.
     */
    @Column(name = "schedule_start", nullable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date startDate;
    /**
     * The due date.
     */
    @Column(name = "schedule_due", nullable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    
    /**
     * Inits the embeddable.
     */
    public ScheduleEmbed() {
        // nothing special to do
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Date getStartDate() {
        return startDate;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Date getDueDate() {
        return dueDate;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void setStartDate(final Date d) {
        startDate = d;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void setDueDate(final Date d) {
        dueDate = d;
    }
    
}
