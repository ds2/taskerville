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

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ds2.taskerville.api.Comment;
import ds2.taskerville.api.ContentType;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.TimeAware;
import ds2.taskerville.api.user.User;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.JoinTable;

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
  @JoinTable(name = "TSK_J_COMMENTAUTHOR", joinColumns =
  @JoinColumn(name = "COMMENT_ID"), inverseJoinColumns =
  @JoinColumn(name = "USER_ID"))
  private User author;
  @Embedded
  private TimeAwareEmbed time;
  @Column(name = "comment", length = 2000, nullable = false)
  private String comment;
  @ManyToOne(targetEntity = UserEntity.class)
  @JoinTable(name = "TSK_J_COMMENTEDITOR", joinColumns =
  @JoinColumn(name = "COMMENT_ID"), inverseJoinColumns =
  @JoinColumn(name = "USER_ID"))
  private User editor;
  @Embedded
  private StateAwareEmbed state;

  public CommentEntity() {
    time = new TimeAwareEmbed();
    state = new StateAwareEmbed();
  }

  @Override
  public User getAuthor() {
    return author;
  }

  @Override
  public String getComment() {
    return comment;
  }

  @Override
  public ContentType getContentType() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Date getCreated() {
    return time.getCreated();
  }

  @Override
  public Date getDeleted() {
    return time.getDeleted();
  }

  @Override
  public User getEditor() {
    return editor;
  }

  @Override
  public Date getModified() {
    return time.getModified();
  }

  @Override
  public long getId() {
    return id;
  }

  @Override
  public EntryStates getEntryState() {
    return state.getEntryState();
  }

  @Override
  public void setEntryState(EntryStates s) {
    state.setEntryState(s);
  }
}
