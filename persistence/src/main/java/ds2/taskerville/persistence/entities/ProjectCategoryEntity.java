/**
 * 
 */
package ds2.taskerville.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.ProjectCategory;

/**
 * @author kaeto23
 * 
 */
@Entity(name = "projectCategory")
@Table(name = "TSK_PROJECTCATEGORY")
@TableGenerator(name = "tableGen2", allocationSize = 5, initialValue = 1)
public class ProjectCategoryEntity implements ProjectCategory {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = -1735295917056409748L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tableGen2")
    private long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description")
    private String description;
    @Embedded
    private EntryStateEmbeddable entryState;
    
    /**
     * 
     */
    public ProjectCategoryEntity() {
        entryState = new EntryStateEmbeddable();
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
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(ProjectCategory o) {
        return 0;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.ProjectCategory#getTitle()
     */
    @Override
    public String getTitle() {
        return title;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.ProjectCategory#getDescription()
     */
    @Override
    public String getDescription() {
        return description;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.ProjectCategory#getEntryState()
     */
    @Override
    public EntryStates getEntryState() {
        return entryState.getEntryState();
    }
    
    /**
     * @param title
     *            the title to set
     */
    public synchronized void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * @param description
     *            the description to set
     */
    public synchronized void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * @param entryState
     *            the entryState to set
     */
    public synchronized void setEntryState(EntryStates entryState) {
        this.entryState.setEntryState(entryState);
    }
    
}
