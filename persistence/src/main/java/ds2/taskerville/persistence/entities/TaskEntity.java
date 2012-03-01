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
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.Comment;
import ds2.taskerville.api.Component;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.Priority;
import ds2.taskerville.api.Project;
import ds2.taskerville.api.Reference;
import ds2.taskerville.api.Solutions;
import ds2.taskerville.api.Task;
import ds2.taskerville.api.TaskProperty;
import ds2.taskerville.api.TaskType;
import ds2.taskerville.api.WorkLog;
import ds2.taskerville.api.WorkPackage;
import ds2.taskerville.api.flow.TaskState;
import ds2.taskerville.api.processmanagement.ProcessState;
import ds2.taskerville.api.processmanagement.Schedule;
import ds2.taskerville.api.release.TargetRelease;
import ds2.taskerville.api.user.Recipient;
import ds2.taskerville.api.user.User;

/**
 * A task entity.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "task")
@Table(name = "TSK_TASK")
@TableGenerator(
    name = "taskGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "task")
public class TaskEntity implements Task {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "taskGen", strategy = GenerationType.TABLE)
    private long id;
    
    @Override
    public List<TargetRelease> getAffectedReleases() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<Component> getAffectedSubComponents() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<Recipient> getAssignees() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<Attachment> getAttachments() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<Comment> getComments() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Date getCompleted() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Date getCreated() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public User getCreator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Date getDeleted() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public EntryStates getEntryState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public WorkPackage getEstimation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Date getModified() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Priority getPriority() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public ProcessState getProcessState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Project getProject() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public long getProjectTaskId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<TaskProperty> getProperties() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<Reference> getReferences() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Schedule getSchedule() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Solutions getSolution() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public TaskState getState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<String> getTags() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<TargetRelease> getTargetReleases() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String getTitle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public TaskType getType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<User> getWatchers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<WorkLog> getWorkLogs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public void setDeleted(Date d) {
    }
    
    @Override
    public void touchModified() {
    }
}
