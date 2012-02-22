/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.persistence.entities;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.user.Team;
import ds2.taskerville.api.user.User;
import ds2.taskerville.api.user.UserRole;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author kaeto23
 */
@Entity(name = "team")
@Table(name = "TSK_TEAM")
public class TeamEntity implements Team {

  @Id
  private long id;
  private static final long serialVersionUID = 1L;
  @Embedded
  private RecipientEmbeddable recipient;
  @ManyToOne
  @JoinColumn(name = "teamleader_id")
  private User teamLeader;
  private List<Team> subTeams;
  @ManyToMany
  private List<User> members;

  @Override
  public List<User> getMembers() {
    return members;
  }

  @Override
  public List<Team> getSubTeams() {
    return subTeams;
  }

  @Override
  public User getTeamLeader() {
    return teamLeader;
  }

  @Override
  public List<User> getUsersOfRole(UserRole r) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public String getEmailAddress() {
    return recipient.getEmailAddress();
  }

  @Override
  public String getName() {
    return recipient.getName();
  }

  @Override
  public Attachment getProfilePhoto() {
    return recipient.getProfilePhoto();
  }

  @Override
  public EntryStates getState() {
    return recipient.getState();
  }

  @Override
  public long getId() {
    return id;
  }
}
