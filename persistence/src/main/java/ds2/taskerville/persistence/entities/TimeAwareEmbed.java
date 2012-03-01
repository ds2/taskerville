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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.persistence.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.google.common.base.Preconditions;

import ds2.taskerville.api.TimeAware;

/**
 * The TimeAware embeddable.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Embeddable
public class TimeAwareEmbed implements TimeAware {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 1L;
    /**
     * The creation date.
     */
    @Column(name = "created", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    /**
     * The modification date.
     */
    @Column(name = "modified", nullable = false, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    /**
     * The deletion date.
     */
    @Column(name = "deleted", nullable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleted;
    
    /**
     * Inits the embeddable.
     */
    public TimeAwareEmbed() {
        created = new Date();
        modified = created;
    }
    
    @Override
    public final Date getCreated() {
        return created;
    }
    
    @Override
    public final Date getModified() {
        return modified;
    }
    
    @Override
    public final Date getDeleted() {
        return deleted;
    }
    
    @Override
    public final void setDeleted(final Date d) {
        Preconditions.checkNotNull(d, "Deletion date cannot be null.");
        deleted = d;
        touchModified();
    }
    
    @Override
    public final void touchModified() {
        modified = new Date();
    }
}
