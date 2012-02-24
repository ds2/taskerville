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

import ds2.taskerville.api.flow.NextStatePolicy;
import ds2.taskerville.api.flow.TaskState;
import ds2.taskerville.api.user.Recipient;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kaeto23
 */
@Entity(name = "nextStatePolicy")
@Table(name = "TSK_NEXTSTATE")
public class NextStatePolicyEntity implements NextStatePolicy {

  private static final long serialVersionUID = 1L;
  @Id
  private long id;

  @Override
  public TaskState getCurrentState() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public TaskState getNextState() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public String getSwitchTitle() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public List<Recipient> getRequiredAuthorities() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public long getId() {
    return id;
  }
}
