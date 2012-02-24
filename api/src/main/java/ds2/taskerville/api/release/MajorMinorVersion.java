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
/**
 * 
 */
package ds2.taskerville.api.release;

/**
 * A contract for a Major-Minor version. An example might be 1.23-456 or
 * 1.23.456 as version.
 * 
 * @author kaeto23
 * 
 */
public interface MajorMinorVersion extends Version {
	/**
	 * Returns the major revision number.
	 * 
	 * @return the major revision
	 */
	int getMajor();

	/**
	 * Returns the minor revision number.
	 * 
	 * @return the minor revision
	 */
	int getMinor();

	/**
	 * Returns the build number of this release.
	 * 
	 * @return the build number
	 */
	int getBuild();
}
