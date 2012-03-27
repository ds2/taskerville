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

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Singleton;

import ds2.taskerville.api.TimeAmountPrefs;
import ds2.taskerville.api.util.ConverterService;

/**
 * Loads the time amount from a properties file.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Singleton
public class TimeAmountPrefsPropertiesLoader implements TimeAmountPrefs {
    
    /**
     * the svuid.
     */
    private static final long serialVersionUID = 7544432949692500699L;
    /**
     * The loaded properties.
     */
    private final Properties props;
    /**
     * A converter for converting numbers etc.
     */
    @Inject
    private ConverterService conv;
    /**
     * A logger.
     */
    private static final Logger log = Logger
        .getLogger(TimeAmountPrefsPropertiesLoader.class.getName());
    
    /**
     * Inits the prefs by loading the given properties.
     * 
     */
    public TimeAmountPrefsPropertiesLoader() {
        final String propsFile =
            "/ds2/taskerville/taskerville-default.properties";
        props = new Properties();
        final InputStream is = getClass().getResourceAsStream(propsFile);
        if (is != null) {
            try {
                props.load(is);
            } catch (final IOException e) {
                log.warning(e.getLocalizedMessage());
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int getNumDaysPerWeek() {
        return conv.toInt(props.getProperty(PROPERTY_NUMDAYSPERWEEK), 5);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int getNumHourPerDay() {
        return conv.toInt(props.getProperty(PROPERTY_NUMHOURSPERDAY), 8);
    }
}
