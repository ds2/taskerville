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
package ds2.taskerville.api;

import java.util.Date;

import javax.activation.MimeType;

import ds2.taskerville.api.release.Version;
import ds2.taskerville.api.user.User;

/**
 * A file attachment to a task. Usually screenshots, or documents. Whatever you
 * need.
 * 
 * @author dstrauss
 * @version 0.1
 * 
 */
public interface Attachment extends PersistableObject {
    /**
     * Returns the upload date for this attachment.
     * 
     * @return the upload date
     */
    Date getUploadDate();
    
    /**
     * Returns the possible mime type for this attachment.
     * 
     * @return the mime type
     */
    MimeType getType();
    
    /**
     * Returns the possible file name for this attachment.
     * 
     * @return the file name
     */
    String getFileName();
    
    /**
     * Returns the version of this attachment.
     * 
     * @return the version
     */
    Version getVersion();
    
    /**
     * Returns the plain text description of this attachment.
     * 
     * @return the description.
     */
    String getDescription();
    
    /**
     * Returns the one who uploaded the photo.
     * 
     * @return the uploader
     */
    User getUploader();
}
