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
package ds2.taskerville.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.StateAware;

/**
 * The StateAware implementation.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Embeddable
public class StateAwareEmbed implements StateAware {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 1L;
    /**
     * The entry state.
     */
    @Transient
    private EntryStates state;
    /**
     * The state id.
     */
    @Column(name = "state_id", updatable = true, nullable = false)
    private int stateId;
    
    /**
     * Inits the embeddable.
     */
    public StateAwareEmbed() {
        state = EntryStates.Initial;
        stateId = state.getStateId();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final EntryStates getEntryState() {
        if (state == null) {
            state = EntryStates.getById(stateId);
        }
        return state;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final long getId() {
        return -1;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void setEntryState(final EntryStates s) {
        Preconditions.checkNotNull(s, "State must not be null.");
        stateId = s.getStateId();
        state = s;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final String toString() {
        return Objects.toStringHelper(this).add("stateId", stateId)
            .add("state", state).toString();
    }
}
