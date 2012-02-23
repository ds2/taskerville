/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.persistence.entities;

import ds2.taskerville.api.TaskProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kaeto23
 */
@Entity(name = "taskProperty")
@Table(name = "TSK_TASKPROPERTY")
public class TaskPropertyEntity implements TaskProperty {

  private static final long serialVersionUID = 1L;
  @Id
  private long id;
  @Column(name = "name", nullable = false)
  private String name;
  @Column(name = "parser_id", nullable = false, updatable = true)
  private int typeParserId;

  public TaskPropertyEntity() {
  }

  public TaskPropertyEntity(int i, String process, int i0) {
    this();
    id = i;
    name = process;
    typeParserId = i0;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTypeParserId(int typeParserId) {
    this.typeParserId = typeParserId;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getTypeParserId() {
    return typeParserId;
  }

  @Override
  public long getId() {
    return id;
  }

  @Override
  public int compareTo(TaskProperty t) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
