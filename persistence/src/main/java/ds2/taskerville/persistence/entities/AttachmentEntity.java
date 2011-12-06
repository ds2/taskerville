/**
 * 
 */
package ds2.taskerville.persistence.entities;

import java.util.Date;

import javax.activation.MimeType;
import javax.persistence.Entity;
import javax.persistence.Table;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.persistence.api.PersistableObject;

/**
 * @author kaeto23
 * 
 */
@Entity
@Table(name = "TSK_ATTACHMENTS")
public class AttachmentEntity implements Attachment, PersistableObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7838144343178000193L;

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getAttachmentId() {
		// TODO Auto-generated method stub
		return 0;
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
