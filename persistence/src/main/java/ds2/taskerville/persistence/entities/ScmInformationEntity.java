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
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

import ds2.taskerville.api.dev.ScmInformation;
import ds2.taskerville.api.dev.ScmType;

/**
 * The scm info for a release.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "scmInfo")
@Table(name = "TSK_SCMINFO")
@TableGenerator(
    name = "scmGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "scmInfo")
public class ScmInformationEntity implements ScmInformation {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 7006183195711513501L;
    /**
     * The time.
     */
    @Embedded
    private TimeAwareEmbed time;
    /**
     * The scm type.
     */
    @Column(name = "scm", nullable = false)
    private ScmType type;
    /**
     * The developer branch.
     */
    @Column(name = "dev_branch", nullable = false)
    private String developerBranch;
    /**
     * The prerelease tags.
     */
    @Transient
    private List<String> prereleaseTags;
    /**
     * The prerelease branch.
     */
    @Column(name = "prerelease_branch")
    private String prereleaseBranch;
    /**
     * The final live tag.
     */
    @Column(name = "live_tag")
    private String liveTag;
    /**
     * The live branch.
     */
    @Column(name = "live_branch")
    private String liveBranch;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(generator = "scmGen", strategy = GenerationType.TABLE)
    private long id;
    
    /**
     * Inits the entity.
     */
    public ScmInformationEntity() {
        time = new TimeAwareEmbed();
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.PersistableObject#getId()
     */
    @Override
    public long getId() {
        return id;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TimeAware#getCreated()
     */
    @Override
    public Date getCreated() {
        return time.getCreated();
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TimeAware#getModified()
     */
    @Override
    public Date getModified() {
        return time.getModified();
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TimeAware#getDeleted()
     */
    @Override
    public Date getDeleted() {
        return time.getDeleted();
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TimeAware#setDeleted(java.util.Date)
     */
    @Override
    public void setDeleted(Date d) {
        time.setDeleted(d);
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.TimeAware#touchModified()
     */
    @Override
    public void touchModified() {
        time.touchModified();
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.dev.ScmInformation#getType()
     */
    @Override
    public ScmType getType() {
        return type;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.dev.ScmInformation#getDeveloperBranch()
     */
    @Override
    public String getDeveloperBranch() {
        return developerBranch;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.dev.ScmInformation#getPrereleaseTags()
     */
    @Override
    public List<String> getPrereleaseTags() {
        return prereleaseTags;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.dev.ScmInformation#getPrereleaseBranch()
     */
    @Override
    public String getPrereleaseBranch() {
        return prereleaseBranch;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.dev.ScmInformation#getLiveTag()
     */
    @Override
    public String getLiveTag() {
        return liveTag;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.dev.ScmInformation#getLiveBranch()
     */
    @Override
    public String getLiveBranch() {
        return liveBranch;
    }
    
}
