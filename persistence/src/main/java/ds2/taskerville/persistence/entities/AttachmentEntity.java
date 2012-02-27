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

import java.util.Date;

import javax.activation.MimeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.release.Version;

/**
 * @author kaeto23
 * 
 */
@Entity(name = "attachment")
@Table(name = "TSK_ATTACHMENTS")
public class AttachmentEntity implements Attachment {
    
    /**
   *
   */
    private static final long serialVersionUID = -7838144343178000193L;
    @Id
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    private long id;
    @Transient
    private Version version;
    @Column(name = "version", nullable = false, updatable = false)
    private String versionStr;
    @Column(name = "uploaded", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadDate;
    @Transient
    private MimeType type;
    @Column(name = "filename", nullable = false)
    private String fileName;
    /**
     * The description.
     */
    @Column(name = "description", updatable = true, nullable = false)
    private String description;
    
    /**
     * Inits the entity.
     */
    public AttachmentEntity() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public String getFileName() {
        return fileName;
    }
    
    @Override
    public MimeType getType() {
        return type;
    }
    
    @Override
    public Date getUploadDate() {
        return uploadDate;
    }
    
    @Override
    public Version getVersion() {
        return version;
    }
}
