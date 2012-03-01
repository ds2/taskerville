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
package ds2.taskerville.api.svc;

import java.util.List;

import ds2.taskerville.api.Comment;
import ds2.taskerville.api.Task;
import ds2.taskerville.api.TaskProperty;
import ds2.taskerville.api.social.Activity;
import ds2.taskerville.api.social.ActivityType;
import ds2.taskerville.api.user.User;

/**
 * The task activity service.
 * 
 * @author dstrauss
 * @version 0.1
 * 
 */
public interface TaskActivityService {
    Activity addActivity(Task t, User u, ActivityType type, Comment comment,
        TaskProperty prop);
    
    List<Activity> getActivities(User viewer);
}
