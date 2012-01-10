/**
 *
 */
package ds2.taskerville.bridge.googlecode;

import java.util.logging.Logger;


import ds2.taskerville.api.Comment;
import ds2.taskerville.api.ExportSettings;
import ds2.taskerville.api.Task;
import ds2.taskerville.api.svc.TaskExportService;
import javax.inject.Singleton;

/**
 * @author kaeto23
 *
 */
@Singleton
public class GoogleCodeBridgeImpl implements TaskExportService {

  /**
   * a logger.
   */
  private static final Logger log = Logger.getLogger(GoogleCodeBridgeImpl.class.getName());

  /**
   *
   */
  public GoogleCodeBridgeImpl() {
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
