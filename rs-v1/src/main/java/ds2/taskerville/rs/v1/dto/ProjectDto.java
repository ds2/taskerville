/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.rs.v1.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Project datatype.
 * 
 * @author dstrauss
 * @version 1.0
 */
@XmlType(name = "ProjectType")
@XmlRootElement(name = "project")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ProjectDto {
    /**
     * The name of the project.
     */
    @XmlElement
    private String name;
    /**
     * The short code for this project.
     */
    @XmlElement
    private String shortcode;
    /**
     * The id of the project.
     */
    @XmlAttribute
    private long id;
    
    public ProjectDto() {
        // nothing special to do
    }
}
