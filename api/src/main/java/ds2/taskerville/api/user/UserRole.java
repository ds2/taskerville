/**
 *
 */
package ds2.taskerville.api.user;

import ds2.taskerville.api.PersistableObject;

/**
 * The role of a user. Usually, something like developer, productionmanager,
 * serveradmin, releasemanager, producer etc. Basically a job title. A user can
 * own a number of roles, depending on his/her relation to a project.
 *
 * @author kaeto23
 *
 */
public interface UserRole extends PersistableObject {

  String getDescription();

  String getTitle();
}
