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
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.ProjectCategory;

/**
 * The project categories.
 * 
 * @author dstrauss
 * @version 0.1
 * 
 */
@Entity(name = "projectCategory")
@Table(name = "TSK_PROJECTCATEGORY")
@TableGenerator(
    name = "projectCategoryGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "projectCategory")
public class ProjectCategoryEntity implements ProjectCategory {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = -1735295917056409748L;
    /**
     * The id.
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(
        strategy = GenerationType.TABLE,
        generator = "projectCategoryGen")
    private long id;
    /**
     * The title.
     */
    @Column(name = "title", nullable = false)
    private String title;
    /**
     * A possible description.
     */
    @Column(name = "description")
    private String description;
    /**
     * The entry state.
     */
    @Embedded
    private StateAwareEmbed entryState;
    
    /**
     * Inits the entity.
     */
    public ProjectCategoryEntity() {
        entryState = new StateAwareEmbed();
    }
    
    @Override
    public final long getId() {
        return id;
    }
    
    @Override
    public final int compareTo(final ProjectCategory o) {
        return 0;
    }
    
    @Override
    public final String getTitle() {
        return title;
    }
    
    @Override
    public final String getDescription() {
        return description;
    }
    
    @Override
    public final EntryStates getEntryState() {
        return entryState.getEntryState();
    }
    
    /**
     * Sets the title.
     * 
     * @param title
     *            the title to set
     */
    public final synchronized void setTitle(final String title) {
        this.title = title;
    }
    
    /**
     * Sets the description.
     * 
     * @param description
     *            the description to set
     */
    public final synchronized void setDescription(final String description) {
        this.description = description;
    }
    
    @Override
    public final synchronized void setEntryState(final EntryStates entryState) {
        this.entryState.setEntryState(entryState);
    }
    
}
