package ds2.taskerville.persistence.entities;

import ds2.taskerville.api.Attachment;
import ds2.taskerville.api.EntryStates;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2012-02-25T17:05:07.567+0100")
@StaticMetamodel(RecipientEmbeddable.class)
public class RecipientEmbeddable_ {
	public static volatile SingularAttribute<RecipientEmbeddable, Long> id;
	public static volatile SingularAttribute<RecipientEmbeddable, EntryStates> state;
	public static volatile SingularAttribute<RecipientEmbeddable, String> emailAddress;
	public static volatile SingularAttribute<RecipientEmbeddable, String> name;
	public static volatile SingularAttribute<RecipientEmbeddable, Attachment> profilePhoto;
}
