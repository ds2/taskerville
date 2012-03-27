/**
 * 
 */
package ds2.taskerville.ejb;

import java.util.List;

import javax.ejb.Stateless;

import ds2.taskerville.api.Project;
import ds2.taskerville.ejb.api.ProjectFacade;

/**
 * @author Kaeto23
 * 
 */
@Stateless
public class ProjectFacadeBean implements ProjectFacade {
    
    /**
     * 
     */
    public ProjectFacadeBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void delete(final long id) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public List<Project> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Project getById(final long id) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Project getByName(final String n) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Project getByShortcode(final String name) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Project update(final long id, final Project delta) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
