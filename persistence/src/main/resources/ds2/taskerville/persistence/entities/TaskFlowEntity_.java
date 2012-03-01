package ds2.taskerville.persistence.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2012-03-01T11:43:50.982+0100")
@StaticMetamodel(TaskFlowEntity.class)
public class TaskFlowEntity_ {
	public static volatile SingularAttribute<TaskFlowEntity, Long> id;
	public static volatile SingularAttribute<TaskFlowEntity, ProjectEntity> project;
	public static volatile SingularAttribute<TaskFlowEntity, TimeAwareEmbed> time;
	public static volatile SingularAttribute<TaskFlowEntity, StateAwareEmbed> entryState;
	public static volatile SingularAttribute<TaskFlowEntity, String> name;
	public static volatile SingularAttribute<TaskFlowEntity, TaskStateEntity> startState;
}
