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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import ds2.taskerville.api.TaskProperty;

/**
 * 
 * @author kaeto23
 */
@Entity(name = "taskProperty")
@Table(name = "TSK_TASKPROPERTY")
@TableGenerator(
    name = "taskPropertyGen",
    table = "TSK_ID",
    valueColumnName = "next",
    pkColumnName = "pk",
    pkColumnValue = "taskProperty")
public class TaskPropertyEntity implements TaskProperty {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(
        generator = "taskPropertyGen",
        strategy = GenerationType.TABLE)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "parser_id", nullable = false, updatable = true)
    private int typeParserId;
    
    public TaskPropertyEntity() {
    }
    
    public TaskPropertyEntity(int i, String process, int i0) {
        this();
        id = i;
        name = process;
        typeParserId = i0;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setTypeParserId(int typeParserId) {
        this.typeParserId = typeParserId;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getTypeParserId() {
        return typeParserId;
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public int compareTo(TaskProperty t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
