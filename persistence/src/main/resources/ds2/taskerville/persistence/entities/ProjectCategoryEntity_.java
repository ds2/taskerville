package ds2.taskerville.persistence.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2012-03-01T11:42:38.075+0100")
@StaticMetamodel(ProjectCategoryEntity.class)
public class ProjectCategoryEntity_ {
	public static volatile SingularAttribute<ProjectCategoryEntity, Long> id;
	public static volatile SingularAttribute<ProjectCategoryEntity, String> title;
	public static volatile SingularAttribute<ProjectCategoryEntity, String> description;
	public static volatile SingularAttribute<ProjectCategoryEntity, StateAwareEmbed> entryState;
}
