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
package ds2.taskerville.api.user;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.StateAware;

/**
 * This is a group, a team, or a single user.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface RecipientBase extends StateAware {
    
    /**
     * Returns the email address of the recipient.
     * 
     * @return the email address
     */
    String getEmailAddress();
    
    /**
     * Returns the name of the recipient.
     * 
     * @return the human-readable name of the recipient
     */
    String getName();
    
    /**
     * Returns a possible profile photo of the recipient.
     * 
     * @return a profile photo, or null if not set
     */
    Attachment getProfilePhoto();
    
    /**
     * Returns the hosting space this recipient belongs to.
     * 
     * @return the hosting space
     */
    HostingSpace getHostingSpace();
}
