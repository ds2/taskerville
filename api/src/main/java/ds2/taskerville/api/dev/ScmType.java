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
package ds2.taskerville.api.dev;

/**
 * Some famous scm types.
 * 
 * @author dstrauss
 * @version 0.1
 * 
 */
public enum ScmType {
    /**
     * The bazaar scm.
     */
    Bazaar,
    /**
     * The concurrent versioning system.
     */
    CVS,
    /**
     * The git scm.
     */
    Git,
    /**
     * The mercurial scm.
     */
    Mercurial,
    /**
     * The perforce scm.
     */
    Perforce,
    /**
     * Subversion.
     */
    Subversion;
}
