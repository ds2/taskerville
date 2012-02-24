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
package ds2.taskerville.api;

import ds2.taskerville.api.flow.TaskState;
import ds2.taskerville.api.processmanagement.ProcessState;
import ds2.taskerville.api.processmanagement.Schedule;
import ds2.taskerville.api.release.TargetRelease;
import ds2.taskerville.api.user.Recipient;
import ds2.taskerville.api.user.User;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * A single task.
 *
 * @author kaeto23
 * @version 1.0
 */
public interface Task extends PersistableObject {

  /**
   * Returns all releases that are affected by this task. This will usually
   * return all releases where additional work must be done to release a newer
   * version. If this task is a bug, this method will return the affected
   * releases where this bug occurs.
   *
   * @return all affected releases for this task.
   */
  List<TargetRelease> getAffectedReleases();

  /**
   * Returns a list of affected components of this task.
   *
   * @return a component's list
   */
  List<Component> getAffectedSubComponents();

  /**
   * Returns a list of users who have to work on this task. In agile teams, this
   * can me more than one. But usually, only one user should be returned.
   *
   * @return a list of users who are working on this task.
   */
  List<Recipient> getAssignees();

  /**
   * Returns all attachment references for this task.
   *
   * @return all attachment references
   */
  List<Attachment> getAttachments();

  /**
   * Returns all comments for this task.
   *
   * @return all comments
   */
  List<Comment> getComments();

  /**
   * Returns the completion date of this task.
   *
   * @return the date this task has reached the final state.
   */
  Date getCompleted();

  /**
   * Returns the creation date.
   *
   * @return the creation date
   */
  Date getCreated();

  /**
   * Returns the creator of this task.
   *
   * @return the creator
   */
  User getCreator();

  /**
   * Returns the possible deletion date of this task.
   *
   * @return the deletion date.
   */
  Date getDeleted();

  /**
   * Returns a description of this task.
   *
   * @return a bug report, or a feature summary etc.
   */
  String getDescription();

  /**
   * Returns the entry state of this task.
   *
   * @return the entry state.
   */
  EntryStates getEntryState();

  /**
   * Returns the estimated work package defined by this task.
   *
   * @return the possible amount of work and time to do.
   */
  WorkPackage getEstimation();

  /**
   * Returns the modification date of this task. This method is a mapper method
   * for any changes of this task. When someone adds an attachment, or a
   * comment, or changes internal attributes, then this field is updated.
   *
   * @return the modification date
   */
  Date getModified();

  /**
   * Returns the priority of the task.
   *
   * @return the priority.
   */
  Priority getPriority();

  /**
   * Returns the process state for the current state of this task.
   *
   * @return the process state, which is an equivalent of the current state of
   * this task, or null if not applicable
   */
  ProcessState getProcessState();

  /**
   * Returns the project of this task.
   *
   * @return the project
   */
  Project getProject();

  /**
   * Returns the project's task id. This id may be different from the original
   * id and may be a counter for the project's tasks.
   *
   * @return the task id for this project.
   */
  long getProjectTaskId();

  /**
   * Returns all current task properties.
   *
   * @return a list of task properties
   */
  List<TaskProperty> getProperties();

  /**
   * Returns all known references to this task. Usually, duplicates or subtasks.
   *
   * @return a list of references
   */
  List<Reference> getReferences();

  /**
   * Returns a possible schedule for this task.
   *
   * @return a schedule, or null if not yet set
   */
  Schedule getSchedule();

  /**
   * Returns the current solution for this task.
   *
   * @return the solution. May return null if no solution is existing.
   */
  Solutions getSolution();

  /**
   * Returns the current task state.
   *
   * @return the current state of the task
   */
  TaskState getState();

  /**
   * Returns a number of tags associated with this task.
   *
   * @return a list of tag words.
   */
  List<String> getTags();

  /**
   * Returns all releases where this task has to be a part of. If this task is a
   * bug, then this method will return the releases where the bug is fixed (or
   * should be *fg*) .
   *
   * @return all target releases
   */
  List<TargetRelease> getTargetReleases();

  /**
   * Returns the title of this task.
   *
   * @return the title of this task.
   */
  String getTitle();

  /**
   * Returns the type of the task. Usually, BUG or FEATURE or whatever you like.
   *
   * @return the type of the task
   */
  TaskType getType();

  /**
   * Returns all known watchers for this task.
   *
   * @return all watchers
   *
   */
  List<User> getWatchers();

  /**
   * Returns all known work that has been done on this task.
   *
   * @return a list of works done on this task
   */
  List<WorkLog> getWorkLogs();
}
