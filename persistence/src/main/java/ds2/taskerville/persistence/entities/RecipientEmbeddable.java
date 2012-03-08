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
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.user.HostingSpace;
import ds2.taskerville.api.user.RecipientBase;

/**
 * The recipients entity.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Embeddable
public class RecipientEmbeddable implements RecipientBase {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 1L;
    /**
     * The state.
     */
    @Embedded
    private StateAwareEmbed state;
    /**
     * The email address.
     */
    @Column(name = "email_address")
    private String emailAddress;
    /**
     * The name of the recipient.
     */
    @Column(name = "name", nullable = false)
    private String name;
    /**
     * A profile photo.
     */
    @ManyToOne(targetEntity = AttachmentEntity.class)
    @JoinColumn(name = "PHOTO_ID", nullable = true, updatable = true)
    private Attachment profilePhoto;
    /**
     * The hosting space.
     */
    @ManyToOne(targetEntity = HostingSpaceEntity.class)
    @JoinColumn(name = "space_id", nullable = false, updatable = false)
    private HostingSpace hostingSpace;
    
    /**
     * Inits the embeddable.
     */
    public RecipientEmbeddable() {
        state = new StateAwareEmbed();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final String getEmailAddress() {
        return emailAddress;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final String getName() {
        return name;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final Attachment getProfilePhoto() {
        return profilePhoto;
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
    public final HostingSpace getHostingSpace() {
        return hostingSpace;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final EntryStates getEntryState() {
        return state.getEntryState();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public final void setEntryState(final EntryStates s) {
        state.setEntryState(s);
    }
}
