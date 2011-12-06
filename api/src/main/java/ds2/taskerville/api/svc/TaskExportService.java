/**
 * 
 */
package ds2.taskerville.api.svc;

import ds2.taskerville.api.Comment;
import ds2.taskerville.api.ExportSettings;
import ds2.taskerville.api.Task;

/**
 * @author kaeto23
 * 
 */
public interface TaskExportService {
	boolean exportTask(Task t, ExportSettings settings);

	boolean addComment(Comment c, ExportSettings settings);
}
