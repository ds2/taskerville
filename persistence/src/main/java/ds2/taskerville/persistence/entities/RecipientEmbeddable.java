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

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.user.HostingSpace;
import ds2.taskerville.api.user.Recipient;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * 
 * @author kaeto23
 */
@Embeddable
public class RecipientEmbeddable implements Recipient {
    
    private static final long serialVersionUID = 1L;
    @Id
    private long id;
    @Transient
    private EntryStates state;
    @Column(name = "state_id", updatable = true, nullable = false)
    private int stateId;
    @Column(name = "email_address")
    private String emailAddress;
    @Column(name = "name", nullable = false)
    private String name;
    @Transient
    private Attachment profilePhoto;
    @Transient
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
    public EntryStates getState() {
        return EntryStates.getById(stateId);
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public HostingSpace getHostingSpace() {
        return hostingSpace;
    }
}
