/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2.taskerville.api;

/**
 *
 * @author kaeto23
 */
public interface TaskPropertyValue extends PersistableObject {

  TaskProperty getProperty();

  String getValue();
}
