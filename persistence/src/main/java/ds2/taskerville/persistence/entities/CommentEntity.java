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

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.Comment;
import ds2.taskerville.api.ContentType;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.user.User;

/**
 * The comment entity.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "comment")
@Table(name = "TSK_COMMENT")
@TableGenerator(
    name = "commentGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "comment")
public class CommentEntity implements Comment {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 1L;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(generator = "commentGen", strategy = GenerationType.TABLE)
    private long id;
    /**
     * The author.
     */
    @ManyToOne(targetEntity = UserEntity.class)
    @JoinTable(
        name = "TSK_J_COMMENTAUTHOR",
        joinColumns = @JoinColumn(name = "COMMENT_ID"),
        inverseJoinColumns = @JoinColumn(name = "USER_ID"))
    private User author;
    /**
     * The time embeddable.
     */
    @Embedded
    private TimeAwareEmbed time;
    /**
     * The comment.
     */
    @Column(name = "comment", length = 2000, nullable = false)
    private String comment;
    /**
     * An editor.
     */
    @ManyToOne(targetEntity = UserEntity.class)
    @JoinTable(
        name = "TSK_J_COMMENTEDITOR",
        joinColumns = @JoinColumn(name = "COMMENT_ID"),
        inverseJoinColumns = @JoinColumn(name = "USER_ID"))
    private User editor;
    /**
     * The state embeddable.
     */
    @Embedded
    private StateAwareEmbed state;
    
    /**
     * Inits the entity.
     */
    public CommentEntity() {
        time = new TimeAwareEmbed();
        state = new StateAwareEmbed();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final User getAuthor() {
        return author;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final String getComment() {
        return comment;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final ContentType getContentType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Date getCreated() {
        return time.getCreated();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Date getDeleted() {
        return time.getDeleted();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final User getEditor() {
        return editor;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Date getModified() {
        return time.getModified();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final long getId() {
        return id;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final EntryStates getEntryState() {
        return state.getEntryState();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void setEntryState(final EntryStates s) {
        state.setEntryState(s);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void setDeleted(final Date d) {
        time.setDeleted(d);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void touchModified() {
        time.touchModified();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final int compareTo(final Comment o) {
        // TODO Auto-generated method stub
        return 0;
    }
}
