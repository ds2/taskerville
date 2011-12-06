/**
 * 
 */
package ds2.taskerville.ejb;

import javax.ejb.Stateless;
import javax.jws.WebService;

import ds2.taskerville.api.svc.TaskerVilleRemoteService;

/**
 * @author kaeto23
 * 
 */
@Stateless(name = "TaskerVilleRemoteBean")
@WebService(name = "TaskerVilleRemoteService")
public class TaskerVilleRemoteServiceImpl implements TaskerVilleRemoteService {

	/**
	 * 
	 */
	public TaskerVilleRemoteServiceImpl() {
		// TODO Auto-generated constructor stub
	}

}
