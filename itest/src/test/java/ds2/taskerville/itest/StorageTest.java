package ds2.taskerville.itest;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ByteArrayAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import ds2.taskerville.persistence.JpaSupport;
import ds2.taskerville.persistence.api.PersistenceService;
import ds2.taskerville.persistence.entities.RecipientEmbeddable;
import ds2.taskerville.persistence.entities.TaskStateEntity;

/**
 * The db tests.
 * 
 * @author dstrauss
 * @version 0.2
 */
@RunWith(Arquillian.class)
public class StorageTest {
    /**
     * Create the ejb jar file to deploy.
     * 
     * @return the java archive to deploy
     */
    @Deployment
    public static JavaArchive createTestArchive() {
        return ShrinkWrap
            .create(JavaArchive.class, "test.jar")
            .addPackage(JpaSupport.class.getPackage())
            .addPackage(RecipientEmbeddable.class.getPackage())
            .addPackage(PersistenceService.class.getPackage())
            .addAsManifestResource(new ByteArrayAsset("<beans/>".getBytes()),
                ArchivePaths.create("beans.xml"))
            .addAsManifestResource("test-persistence.xml",
                ArchivePaths.create("persistence.xml"));
    }
    
    /**
     * The service to test.
     */
    @EJB
    private PersistenceService db;
    
    /**
     * Inits the test class.
     */
    public StorageTest() {
        // nothing special to do
    }
    
    /**
     * Tests inserts.
     */
    @Test
    public final void testInsert1() {
        TaskStateEntity s1 = new TaskStateEntity();
        s1.setId(1);
        s1.setStateDescription("My Descr");
        s1.setStateTitle("New");
        db.persistObject(s1);
    }
    
    @Test
    public final void testInsertNull() {
    }
    
    @Test
    public final void testCheckExistence() {
    }
    
}
