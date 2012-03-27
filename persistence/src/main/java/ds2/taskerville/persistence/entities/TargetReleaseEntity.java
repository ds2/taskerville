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
package ds2.taskerville.persistence.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import ds2.taskerville.api.Project;
import ds2.taskerville.api.dev.ScmInformation;
import ds2.taskerville.api.release.TargetRelease;
import ds2.taskerville.api.release.Version;
import ds2.taskerville.api.svc.VersionParser;

/**
 * @author kaeto23
 *
 */
/**
 * The target release entity.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "targetRelease")
@Table(name = "TSK_TARGETRELEASE")
@TableGenerator(
    name = "targetReleaseGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "targetRelease")
public class TargetReleaseEntity implements TargetRelease {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = -8687921119372265753L;
    /**
     * A description.
     */
    @Column(name = "description")
    private String description;
    /**
     * The developer start date.
     */
    @Column(name = "init")
    @Temporal(TemporalType.DATE)
    private Date developerStartDate;
    /**
     * The final live date.
     */
    @Column(name = "final_live")
    @Temporal(TemporalType.DATE)
    private Date finalLiveDate;
    /**
     * The id of the entity.
     */
    @Id
    @GeneratedValue(
        generator = "targetReleaseGen",
        strategy = GenerationType.TABLE)
    private long id;
    /**
     * The possible live date.
     */
    @Column(name = "live")
    @Temporal(TemporalType.DATE)
    private Date liveDate;
    /**
     * The prerelease date.
     */
    @Column(name = "prerelease")
    @Temporal(TemporalType.DATE)
    private Date prereleaseDate;
    /**
     * The project.
     */
    @ManyToOne(targetEntity = ProjectEntity.class)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;
    /**
     * The scm data for this release.
     */
    @ManyToOne(targetEntity = ScmInformationEntity.class)
    @JoinColumn(name = "scm_info_id")
    private ScmInformation scm;
    /**
     * The time.
     */
    @Embedded
    private final TimeAwareEmbed time;
    /**
     * The version string.
     */
    @Column(name = "version", nullable = false)
    private String version;
    /**
     * The version parser.
     */
    private VersionParser vp;
    
    /**
     * Inits the entity.
     */
    public TargetReleaseEntity() {
        time = new TimeAwareEmbed();
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
    public final Date getDeveloperStartDate() {
        return developerStartDate;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Date getFinalLiveDate() {
        return finalLiveDate;
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
    public final Date getLiveDate() {
        return liveDate;
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
    public final Date getPrereleaseDate() {
        return prereleaseDate;
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
    public final ScmInformation getScm() {
        return scm;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Version getVersion() {
        return vp.parse(version);
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
    public final void touchModified() {
        time.touchModified();
    }
    
}
