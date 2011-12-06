/**
 * 
 */
package ds2.taskerville.api;

import java.io.Serializable;
import java.util.Map;

/**
 * Some settings to export a task to another task management system.
 * 
 * @author kaeto23
 * 
 */
public interface ExportSettings extends Serializable {
	static String PROPERTY_USERNAME = "username";
	static String PROPERTY_PASSWORD = "pw";

	TaskManagementSystems getManagementSystem();

	Map<String, Project> getMainComponentMap();

	Map<String, Component> getSubComponentMap();

	String getProperty(String propertyName);
}
