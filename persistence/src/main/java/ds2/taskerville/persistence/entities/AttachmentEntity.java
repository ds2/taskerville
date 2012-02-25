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

import javax.activation.MimeType;
import javax.persistence.Entity;
import javax.persistence.Table;

import ds2.taskerville.api.Attachment;
import javax.persistence.Id;

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
  private long id;

  /**
   *
   */
  public AttachmentEntity() {
    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc)
   *
   * @see ds2.taskerville.persistence.api.PersistenceObject#getId()
   */
  @Override
  public long getId() {
    return id;
  }

  @Override
  public byte[] getContent() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getDescription() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getFileName() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public MimeType getType() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Date getUploadDate() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getVersion() {
    // TODO Auto-generated method stub
    return null;
  }
}
