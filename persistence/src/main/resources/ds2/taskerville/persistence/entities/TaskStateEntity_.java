package ds2.taskerville.persistence.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2012-02-25T17:05:07.595+0100")
@StaticMetamodel(TaskStateEntity.class)
public class TaskStateEntity_ {
	public static volatile SingularAttribute<TaskStateEntity, Long> id;
	public static volatile ListAttribute<TaskStateEntity, TaskPropertyEntity> requiredProperties;
	public static volatile SingularAttribute<TaskStateEntity, String> stateTitle;
	public static volatile SingularAttribute<TaskStateEntity, String> stateDescription;
}
