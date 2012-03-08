/**
 * 
 */
package ds2.taskerville.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.ReferenceType;

/**
 * The known reference types.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "referenceType")
@Table(name = "TSK_REFERENCETYPE")
@TableGenerator(
    name = "refTypeGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "referenceType")
public class ReferenceTypeEntity implements ReferenceType {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 5532546740338910888L;
    /**
     * The id.
     */
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(generator = "refTypeGen", strategy = GenerationType.TABLE)
    private long id;
    /**
     * The title.
     */
    @Column(name = "title", unique = true, nullable = false)
    private String title;
    /**
     * The opposite title.
     */
    @Column(name = "op_title", unique = true, nullable = false)
    private String oppositeTitle;
    
    /**
     * Inits the entity.
     */
    public ReferenceTypeEntity() {
        // TODO Auto-generated constructor stub
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
     * @see ds2.taskerville.api.ReferenceType#getTitle()
     */
    @Override
    public String getTitle() {
        return title;
    }
    
    /*
     * (non-Javadoc)
     * @see ds2.taskerville.api.ReferenceType#getOppositeTitle()
     */
    @Override
    public String getOppositeTitle() {
        return oppositeTitle;
    }
    
}
