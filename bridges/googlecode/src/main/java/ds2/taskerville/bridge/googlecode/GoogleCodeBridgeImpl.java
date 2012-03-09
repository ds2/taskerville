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
package ds2.taskerville.bridge.googlecode;

import java.util.logging.Logger;

import javax.inject.Singleton;

import ds2.taskerville.api.Comment;
import ds2.taskerville.api.ExportSettings;
import ds2.taskerville.api.Task;
import ds2.taskerville.api.svc.TaskExportService;

/**
 * The google code bridge implementation.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Singleton
public class GoogleCodeBridgeImpl implements TaskExportService {
    
    /**
     * a logger.
     */
    private static final Logger log = Logger
        .getLogger(GoogleCodeBridgeImpl.class.getName());
    
    /**
     * Inits the bridge.
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
