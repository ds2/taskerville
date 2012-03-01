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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
import ds2.taskerville.api.user.Recipient;

/**
 * 
 * @author kaeto23
 */
@Embeddable
public class RecipientEmbeddable implements Recipient {
    
    private static final long serialVersionUID = 1L;
    @Embedded
    private StateAwareEmbed state;
    @Column(name = "email_address")
    private String emailAddress;
    @Column(name = "name", nullable = false)
    private String name;
    @ManyToOne(targetEntity = AttachmentEntity.class)
    @JoinColumn(name = "PHOTO_ID", nullable = true, updatable = true)
    private Attachment profilePhoto;
    @ManyToOne(targetEntity = HostingSpaceEntity.class)
    @JoinColumn(name = "space_id", nullable = false, updatable = false)
    private HostingSpace hostingSpace;
    
    @Override
    public String getEmailAddress() {
        return emailAddress;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public Attachment getProfilePhoto() {
        return profilePhoto;
    }
    
    @Override
    public long getId() {
        return -1;
    }
    
    @Override
    public HostingSpace getHostingSpace() {
        return hostingSpace;
    }
    
    @Override
    public EntryStates getEntryState() {
        return state.getEntryState();
    }
    
    @Override
    public void setEntryState(EntryStates s) {
        state.setEntryState(s);
    }
}
