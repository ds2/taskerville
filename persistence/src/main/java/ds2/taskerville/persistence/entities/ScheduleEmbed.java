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
     * The due date.
     */
    @Column(name = "schedule_due", nullable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    /**
     * The start date.
     */
    @Column(name = "schedule_start", nullable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date startDate;
    
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
    public final Date getDueDate() {
        return dueDate;
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
    public final void setDueDate(final Date d) {
        dueDate = d;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void setStartDate(final Date d) {
        startDate = d;
    }
    
}
