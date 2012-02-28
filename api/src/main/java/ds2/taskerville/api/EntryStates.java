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
package ds2.taskerville.api;

import java.util.HashMap;
import java.util.Map;

/**
 * A list of entry states.
 * 
 * @author kaeto23
 * @version 1.0
 */
public enum EntryStates {
    
    /**
     * The entry is deleted, and should be considered not available for any
     * search.
     */
    Deleted(3),
    /**
     * The entry is locked. It can be found, but not changed, or edited some
     * way.
     */
    Locked(2),
    /**
     * The entry is valid
     */
    Valid(1),
    /**
     * The entry has just been created. Perhaps needs approval.
     */
    Initial(0);
    /**
     * the state id.
     */
    private int stateId;
    /**
     * A caching state map.
     */
    private static Map<Integer, EntryStates> statesMap = new HashMap<>();
    
    /**
     * Creates a constant.
     * 
     * @param sId
     *            the state id as a number
     */
    private EntryStates(final int sId) {
        stateId = sId;
    }
    
    /**
     * Returns the state id.
     * 
     * @return the state id
     */
    public int getStateId() {
        return stateId;
    }
    
    /**
     * Returns the entry state with the given id.
     * 
     * @param stateId2
     *            the id of the state
     * @return the state, or null if unknown
     */
    public static EntryStates getById(int stateId2) {
        return statesMap.get(Integer.valueOf(stateId2));
    }
    
    static {
        statesMap.put(Initial.getStateId(), Initial);
        statesMap.put(Valid.getStateId(), Valid);
        statesMap.put(Locked.getStateId(), Locked);
        statesMap.put(Deleted.getStateId(), Deleted);
    }
}
