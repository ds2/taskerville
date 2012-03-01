/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.persistence.entities;

import java.net.URL;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.Component;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.Project;
import ds2.taskerville.api.TaskType;
import ds2.taskerville.api.processmanagement.ProcessManagement;
import ds2.taskerville.api.user.HostingSpace;
import ds2.taskerville.api.user.User;

/**
 * 
 * @author kaeto23
 */
@Entity(name = "project")
@Table(name = "TSK_PROJECT")
@TableGenerator(
    name = "projectGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "taskFlow")
public class ProjectEntity implements Project {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "projectGen")
    private long id;
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are
        // not set
        if (!(object instanceof ProjectEntity)) {
            return false;
        }
        ProjectEntity other = (ProjectEntity) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "ds2.taskerville.persistence.entities.ProjectEntity[ id=" + id
            + " ]";
    }
    
    @Override
    public String getShortTitle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<TaskType> getSupportedTaskTypes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<Component> getSubComponents() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public URL getHomepage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public ProcessManagement getManagement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public EntryStates getEntryState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public HostingSpace getHostingSpace() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String getTitle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public User getLead() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void setEntryState(EntryStates s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Date getCreated() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Date getModified() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public Date getDeleted() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
