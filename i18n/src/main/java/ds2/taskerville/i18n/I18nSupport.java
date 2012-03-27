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
package ds2.taskerville.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * The i18n support.
 * 
 * @author dstrauss
 * @version 0.1
 */
public class I18nSupport {
    /**
     * The resource bundle.
     */
    private final ResourceBundle rb;
    
    /**
     * Instantiates the i18n support using the default locale.
     */
    public I18nSupport() {
        this(Locale.getDefault());
    }
    
    /**
     * Instantiates the i18n support using the given locale.
     * 
     * @param l
     *            the locale to use.
     */
    public I18nSupport(final Locale l) {
        rb = ResourceBundle.getBundle("/ds2/taskerville/i18n/taskerville", l);
    }
    
    /**
     * Returns the message with the given key.
     * 
     * @param key
     *            the i18n key
     * @param args
     *            some arguments which replace any placeholders in the i18n
     *            value
     * @return an empty string in case of an error (usually the key name), or
     *         the i18n value.
     */
    public final String getMessage(final String key, final Object... args) {
        String rc = rb.getString(key);
        if (args != null && args.length > 0) {
            rc = MessageFormat.format(rc, args);
        }
        return rc;
    }
}
