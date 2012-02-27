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

import ds2.taskerville.api.user.User;

import java.util.Date;

/**
 * A comment to a task.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface Comment extends PersistableObject {
    
    /**
     * Returns the initial author of the comment.
     * 
     * @return the author
     */
    User getAuthor();
    
    /**
     * Returns the comment as a simple string. The string must be parsed
     * considering the type of the content!
     * 
     * @return the comment
     */
    String getComment();
    
    /**
     * Returns the type of the comment.
     * 
     * @return the content type
     */
    ContentType getContentType();
    
    /**
     * Returns the creation date.
     * 
     * @return the creation date
     */
    Date getCreated();
    
    /**
     * Returns the deletion date.
     * 
     * @return the deletion date. Will return null of not yet deleted.
     */
    Date getDeleted();
    
    /**
     * Returns the editor of the comment.
     * 
     * @return the editor, or null if the comment has not been edited yet.
     */
    User getEditor();
    
    /**
     * Returns the modification date.
     * 
     * @return the modification date
     */
    Date getModified();
    
    /**
     * Returns the state of the entry.
     * 
     * @return the state of the entry
     */
    EntryStates getState();
}
