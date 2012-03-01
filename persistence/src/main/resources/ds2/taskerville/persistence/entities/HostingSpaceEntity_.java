package ds2.taskerville.persistence.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2012-03-01T11:41:29.028+0100")
@StaticMetamodel(HostingSpaceEntity.class)
public class HostingSpaceEntity_ {
	public static volatile SingularAttribute<HostingSpaceEntity, Long> id;
	public static volatile SingularAttribute<HostingSpaceEntity, String> name;
	public static volatile ListAttribute<HostingSpaceEntity, UserEntity> users;
	public static volatile ListAttribute<HostingSpaceEntity, TeamEntity> teams;
	public static volatile ListAttribute<HostingSpaceEntity, ProjectCategoryEntity> categories;
	public static volatile SingularAttribute<HostingSpaceEntity, StateAwareEmbed> state;
	public static volatile SingularAttribute<HostingSpaceEntity, TimeAwareEmbed> time;
}
