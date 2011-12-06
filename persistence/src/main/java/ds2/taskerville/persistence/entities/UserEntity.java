/**
 * 
 */
package ds2.taskerville.persistence.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.user.Team;
import ds2.taskerville.api.user.User;
import ds2.taskerville.api.user.UserRole;
import ds2.taskerville.persistence.api.PersistableObject;

/**
 * @author kaeto23
 * 
 */
@Entity
@Table(name = "TSK_USERS")
public class UserEntity implements PersistableObject, User {

	/**
	 * The svuid.
	 */
	private static final long serialVersionUID = 3724949878431763324L;
	@Id
	@Column(name = "id", nullable = false, updatable = false, unique = true)
	private long id;
	@Column(name = "email")
	private String emailAddress;
	@Column(name = "nickname")
	private String name;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds2.taskerville.api.user.User#getMemberTeams()
	 */
	@Override
	public List<Team> getMemberTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds2.taskerville.api.user.User#getRoles()
	 */
	@Override
	public List<UserRole> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds2.taskerville.api.user.Recipient#getEmailAddress()
	 */
	@Override
	public String getEmailAddress() {
		return emailAddress;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds2.taskerville.api.user.Recipient#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds2.taskerville.api.user.Recipient#getProfilePhoto()
	 */
	@Override
	public Attachment getProfilePhoto() {
		// TODO Auto-generated method stub
		return null;
	}

}
