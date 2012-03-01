package ds2.taskerville.persistence.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2012-02-25T17:05:07.541+0100")
@StaticMetamodel(CommentEntity.class)
public class CommentEntity_ {
	public static volatile SingularAttribute<CommentEntity, Long> id;
	public static volatile SingularAttribute<CommentEntity, UserEntity> author;
}
