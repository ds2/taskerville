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
package ds2.taskerville.business.impl;

import java.util.logging.Logger;

import ds2.taskerville.api.flow.TaskFlow;
import ds2.taskerville.api.user.HostingSpace;
import ds2.taskerville.api.util.ConverterService;

/**
 * The basic implementation of a converter.
 * 
 * @author dstrauss
 * @version 0.1
 */
public class ConverterImpl implements ConverterService {
    
    /**
     * A logger.
     */
    private static final Logger LOG = Logger.getLogger(ConverterImpl.class
        .getName());
    
    /**
     * Inits the impl.
     */
    public ConverterImpl() {
        // nothing special to do
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final int toInt(final String s, final int defValue) {
        if (s == null || s.length() <= 0) {
            return defValue;
        }
        int rc = defValue;
        try {
            rc = Integer.parseInt(s);
        } catch (final NumberFormatException e) {
            LOG.info("Error when parsing \"" + s + "\": "
                + e.getLocalizedMessage());
        }
        return rc;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final HostingSpace toHostingSpace(final HostingSpace e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final TaskFlow toTaskFlow(final TaskFlow t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
