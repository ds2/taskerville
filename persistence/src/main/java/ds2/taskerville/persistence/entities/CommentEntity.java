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

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ds2.taskerville.api.Comment;
import ds2.taskerville.api.ContentType;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.user.User;

/**
 * 
 * @author kaeto23
 */
@Entity(name = "comment")
@Table(name = "TSK_COMMENT")
public class CommentEntity implements Comment {
    
    private static final long serialVersionUID = 1L;
    @Id
    private long id;
    @ManyToOne(targetEntity = UserEntity.class)
    @JoinColumn(name = "author_id")
    private User author;
    
    @Override
    public User getAuthor() {
        return author;
    }
    
    @Override
    public String getComment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public ContentType getContentType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Date getCreated() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Date getDeleted() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public User getEditor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Date getModified() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public EntryStates getState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public long getId() {
        return id;
    }
}
