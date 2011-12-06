/**
 * 
 */
package ds2.taskerville.bridge.googlecode;

import java.util.logging.Logger;

import com.google.gdata.client.projecthosting.ProjectHostingService;
import com.google.gdata.util.Version;
import com.google.inject.Singleton;

import ds2.taskerville.api.Comment;
import ds2.taskerville.api.ExportSettings;
import ds2.taskerville.api.Task;
import ds2.taskerville.api.svc.TaskExportService;

/**
 * @author kaeto23
 * 
 */
@Singleton
public class GoogleCodeBridgeImpl implements TaskExportService {
	/**
	 * The access to the projecthosting service.
	 */
	private ProjectHostingService svc = null;
	/**
	 * a logger.
	 */
	private static final Logger log = Logger
			.getLogger(GoogleCodeBridgeImpl.class.getName());

	/**
	 * 
	 */
	public GoogleCodeBridgeImpl() {
		svc = new ProjectHostingService("");
		Version v = svc.getProtocolVersion();
		log.info("ProjectHosting version: " + v.getVersionString());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean addComment(Comment c, ExportSettings settings) {
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean exportTask(Task t, ExportSettings settings) {
		return false;
	}

}
