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
package ds2.taskerville.api.release;

import java.util.Date;

import ds2.taskerville.api.PersistableObject;
import ds2.taskerville.api.Project;
import ds2.taskerville.api.TimeAware;
import ds2.taskerville.api.dev.ScmInformation;

/**
 * A software release.
 * 
 * @author dstrauss
 * @version 0.1
 * 
 */
public interface TargetRelease extends PersistableObject, TimeAware {
    
    /**
     * Returns the project this release belongs to.
     * 
     * @return the project.
     */
    Project getProject();
    
    /**
     * Returns the version of this release.
     * 
     * @return the version.
     */
    Version getVersion();
    
    /**
     * Returns the description of this release.
     * 
     * @return the description
     */
    String getDescription();
    
    /**
     * Returns the start date for the developers to start coding for this
     * release.
     * 
     * @return the developer start date
     */
    Date getDeveloperStartDate();
    
    /**
     * Returns the prerelease date for this release. With this date, the coding
     * MAY stop, and the QA phase may begin.
     * 
     * @return the prerelease date.
     */
    Date getPrereleaseDate();
    
    /**
     * Returns the official live date.
     * 
     * @return the official live date
     */
    Date getLiveDate();
    
    /**
     * Returns the final live date of the software release. If this field is
     * set, no changes can be performed to the involved tasks.
     * 
     * @return null, if not yet switched live, or the live switch date.
     */
    Date getFinalLiveDate();
    
    /**
     * Returns some SCM information about this release. This is an extension to
     * support the auto-build feature.
     * 
     * @return a possible scm information. Or null if not known.
     */
    ScmInformation getScm();
}
