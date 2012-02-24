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

import ds2.taskerville.api.util.ConverterService;

/**
 * The basic implementation of a converter.
 * 
 * @author kaeto23
 * @version 1.0
 */
public class ConverterImpl implements ConverterService {
	/**
	 * A logger.
	 */
	private static final Logger log = Logger.getLogger(ConverterImpl.class
			.getName());

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int toInt(String s, int defValue) {
		if (s == null || s.length() <= 0) {
			return defValue;
		}
		int rc = defValue;
		try {
			rc = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			log.info("Error when parsing \"" + s + "\": "
					+ e.getLocalizedMessage());
		}
		return rc;
	}

}
