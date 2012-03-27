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
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.Comment;
import ds2.taskerville.api.Component;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.Priority;
import ds2.taskerville.api.Project;
import ds2.taskerville.api.Solutions;
import ds2.taskerville.api.Task;
import ds2.taskerville.api.TaskPropertyValue;
import ds2.taskerville.api.TaskType;
import ds2.taskerville.api.WorkLog;
import ds2.taskerville.api.WorkPackage;
import ds2.taskerville.api.flow.TaskState;
import ds2.taskerville.api.processmanagement.ProcessState;
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
    /**
     * The components.
     */
    @ManyToMany(targetEntity = ComponentEntity.class)
    @JoinTable(name = "TSK_J_TASK_COMPONENT", joinColumns = @JoinColumn(
        name = "TASK_ID"), inverseJoinColumns = @JoinColumn(
        name = "COMPONENT_ID"))
    private List<Component> affectedComponents;
    /**
     * The affected releases.
     */
    @ManyToMany(targetEntity = TargetReleaseEntity.class)
    @JoinTable(
        name = "TSK_J_TASK_RELEASE",
        joinColumns = @JoinColumn(name = "TASK_ID"),
        inverseJoinColumns = @JoinColumn(name = "RELEASE_ID"))
    private List<TargetRelease> affectedReleases;
    /**
     * The assignees.
     */
    @ManyToMany(targetEntity = RecipientEntity.class)
    @JoinTable(name = "TSK_J_TASK_ASSIGNEES", joinColumns = @JoinColumn(
        name = "TASK_ID"), inverseJoinColumns = @JoinColumn(
        name = "ASSIGNEE_ID"))
    private List<Recipient> assignees;
    /**
     * A set of possible attachments.
     */
    @OneToMany(targetEntity = AttachmentEntity.class)
    @JoinTable(name = "TSK_J_TASK_ATTACHMENTS", joinColumns = @JoinColumn(
        name = "TASK_ID"), inverseJoinColumns = @JoinColumn(
        name = "ATTACHMENT_ID"))
    private List<Attachment> attachments;
    /**
     * A list of comments.
     */
    @OneToMany(targetEntity = CommentEntity.class)
    @JoinTable(
        name = "TSK_J_TASK_COMMENT",
        joinColumns = @JoinColumn(name = "TASK_ID"),
        inverseJoinColumns = @JoinColumn(name = "COMMENT_ID"))
    private List<Comment> comments;
    /**
     * The completion date.
     */
    @Column(name = "completed")
    @Temporal(TemporalType.DATE)
    private Date completed;
    /**
     * The creator.
     */
    @ManyToOne(targetEntity = UserEntity.class)
    @JoinColumn(name = "creator_id")
    private User creator;
    
    /**
     * The task description.
     */
    @Column(name = "description")
    private String description;
    /**
     * The work estimation.
     */
    @OneToOne(targetEntity = WorkPackageEntity.class)
    @JoinColumn(name = "estimation_id")
    private WorkPackage estimation;
    /**
     * The id of the task.
     */
    @Id
    @GeneratedValue(generator = "taskGen", strategy = GenerationType.TABLE)
    private long id;
    /**
     * The priority.
     */
    @ManyToOne(targetEntity = PriorityEntity.class)
    @JoinColumn(name = "priority_id")
    private Priority priority;
    /**
     * The process state.
     */
    @Transient
    private ProcessState processState;
    /**
     * The project.
     */
    @ManyToOne(targetEntity = ProjectEntity.class)
    @JoinColumn(name = "project_id")
    private Project project;
    /**
     * The task id.
     */
    @Column(name = "task_id")
    private long projectTaskId;
    /**
     * A set of properties.
     */
    @OneToMany(targetEntity = TaskPropertyValueEntity.class)
    @JoinTable(
        name = "TSK_J_TASK_TASKPROPVALUE",
        joinColumns = @JoinColumn(name = "TASK_ID"),
        inverseJoinColumns = @JoinColumn(name = "PROPVAL_ID"))
    private List<TaskPropertyValue> properties;
    /**
     * The schedule embed.
     */
    @Embedded
    private final ScheduleEmbed schedule;
    /**
     * The solution.
     */
    @Column(name = "solution")
    private Solutions solution;
    /**
     * The state.
     */
    @Embedded
    private final StateAwareEmbed state;
    /**
     * Some tags.
     */
    @Transient
    private List<String> tags;
    /**
     * The target releases.
     */
    @ManyToMany(targetEntity = TargetReleaseEntity.class)
    @JoinTable(
        name = "TSK_J_TASK_RELEASE",
        joinColumns = @JoinColumn(name = "TASK_ID"),
        inverseJoinColumns = @JoinColumn(name = "RELEASE_ID"))
    private List<TargetRelease> targetReleases;
    /**
     * The task state.
     */
    @ManyToOne(targetEntity = TaskStateEntity.class)
    @JoinColumn(name = "taskstate_id")
    private TaskState taskState;
    /**
     * The time.
     */
    @Embedded
    private final TimeAwareEmbed time;
    /**
     * The task title.
     */
    @Column(name = "title", nullable = false)
    private String title;
    /**
     * The task type.
     */
    @ManyToOne(targetEntity = TaskTypeEntity.class)
    @JoinColumn(name = "type_id", nullable = false)
    private TaskType type;
    /**
     * The watchers.
     */
    @ManyToMany(targetEntity = UserEntity.class)
    @JoinTable(
        name = "TSK_J_TASK_WATCHERS",
        joinColumns = @JoinColumn(name = "TASK_ID"),
        inverseJoinColumns = @JoinColumn(name = "WATCHER_ID"))
    private List<User> watchers;
    /**
     * The work logs.
     */
    @OneToMany(targetEntity = WorkLogEntity.class)
    @JoinTable(
        name = "TSK_J_TASK_WORKLOG",
        joinColumns = @JoinColumn(name = "TASK_ID"),
        inverseJoinColumns = @JoinColumn(name = "WORKLOG_ID"))
    private List<WorkLog> workLogs;
    
    /**
     * Inits the entity.
     */
    public TaskEntity() {
        schedule = new ScheduleEmbed();
        time = new TimeAwareEmbed();
        state = new StateAwareEmbed();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<TargetRelease> getAffectedReleases() {
        return affectedReleases;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<Component> getAffectedSubComponents() {
        return affectedComponents;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<Recipient> getAssignees() {
        return assignees;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<Attachment> getAttachments() {
        return attachments;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<Comment> getComments() {
        return comments;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Date getCompleted() {
        return completed;
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
    public final User getCreator() {
        return creator;
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
    public final String getDescription() {
        return description;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Date getDueDate() {
        return schedule.getDueDate();
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
    public final WorkPackage getEstimation() {
        return estimation;
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
    public final Date getModified() {
        return time.getModified();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Priority getPriority() {
        return priority;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final ProcessState getProcessState() {
        return processState;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Project getProject() {
        return project;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final long getProjectTaskId() {
        return projectTaskId;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<TaskPropertyValue> getProperties() {
        return properties;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Solutions getSolution() {
        return solution;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Date getStartDate() {
        return schedule.getStartDate();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final TaskState getState() {
        return taskState;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<String> getTags() {
        return tags;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<TargetRelease> getTargetReleases() {
        return targetReleases;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final String getTitle() {
        return title;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final TaskType getType() {
        return type;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<User> getWatchers() {
        return watchers;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final List<WorkLog> getWorkLogs() {
        return workLogs;
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
    public final void setDueDate(final Date d) {
        schedule.setDueDate(d);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void setStartDate(final Date d) {
        schedule.setStartDate(d);
        
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void touchModified() {
        time.touchModified();
    }
}
