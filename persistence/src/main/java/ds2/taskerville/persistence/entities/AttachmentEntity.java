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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.release.Version;
import ds2.taskerville.api.user.User;

/**
 * The attachment entity.
 * 
 * @author dstrauss
 * @version 0.1
 * 
 */
@Entity(name = "attachment")
@Table(name = "TSK_ATTACHMENTS")
@TableGenerator(
    name = "attachmentGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "attachment")
public class AttachmentEntity implements Attachment {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = -7838144343178000193L;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    @GeneratedValue(
        strategy = GenerationType.TABLE,
        generator = "attachmentGen")
    private long id;
    /**
     * The version.
     */
    @Transient
    private Version version;
    /**
     * The version string.
     */
    @Column(name = "version", nullable = false, updatable = false)
    private String versionStr;
    /**
     * The upload date.
     */
    @Column(name = "uploaded", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadDate;
    /**
     * The mime type.
     */
    @Transient
    private MimeType type;
    /**
     * The file name.
     */
    @Column(name = "filename", nullable = false)
    private String fileName;
    /**
     * The description.
     */
    @Column(name = "description", updatable = true, nullable = false)
    private String description;
    /**
     * The uploader.
     */
    @ManyToOne(targetEntity = UserEntity.class)
    @JoinColumn(name = "uploaded_by", nullable = false, updatable = true)
    private User uploader;
    
    /**
     * Inits the entity.
     */
    public AttachmentEntity() {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final long getId() {
        return id;
    }
    
    @Override
    public final String getDescription() {
        return description;
    }
    
    @Override
    public final String getFileName() {
        return fileName;
    }
    
    @Override
    public final MimeType getType() {
        return type;
    }
    
    @Override
    public final Date getUploadDate() {
        return uploadDate;
    }
    
    @Override
    public final Version getVersion() {
        return version;
    }
    
    @Override
    public final User getUploader() {
        return uploader;
    }
}
