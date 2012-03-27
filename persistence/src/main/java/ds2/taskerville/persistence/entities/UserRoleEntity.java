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
package ds2.taskerville.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.user.UserRole;

/**
 * The user roles.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity(name = "userRole")
@Table(name = "TSK_USERROLES")
@TableGenerator(
    name = "userRoleGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "userRole")
public class UserRoleEntity implements UserRole {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 3652736272564474777L;
    /**
     * The description.
     */
    @Column(name = "description")
    private String description;
    /**
     * The id.
     */
    @Id
    @GeneratedValue(generator = "userRoleGen", strategy = GenerationType.TABLE)
    private long id;
    /**
     * The title.
     */
    @Column(name = "title", nullable = false, updatable = true)
    private String title;
    
    /**
     * Inits the entity.
     */
    public UserRoleEntity() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public final String getDescription() {
        return description;
    }
    
    @Override
    public final long getId() {
        return id;
    }
    
    @Override
    public final String getTitle() {
        return title;
    }
    
}
