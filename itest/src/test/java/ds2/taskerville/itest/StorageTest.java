/*
 * TaskerVille - issue and project management
 * Copyright (C) 2012  Dirk Strauss
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ds2.taskerville.itest;

import ds2.taskerville.api.EntryStates;
import ds2.taskerville.api.TaskProperty;
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
import ds2.taskerville.persistence.entities.HostingSpaceEntity;
import ds2.taskerville.persistence.entities.ProjectCategoryEntity;
import ds2.taskerville.persistence.entities.RecipientEmbeddable;
import ds2.taskerville.persistence.entities.TaskPropertyEntity;
import ds2.taskerville.persistence.entities.TaskStateEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * The db tests.
 * 
 * @author dstrauss
 * @version 0.2
 */
@RunWith(Arquillian.class)
public class StorageTest {
    /**
     * A logger.
     */
    private static final Logger LOG = Logger.getLogger(StorageTest.class
        .getName());
    
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
    public final void testInsertStateWithProps() {
        TaskPropertyEntity prop1 = new TaskPropertyEntity();
        prop1.setId(1);
        prop1.setName("cluster");
        prop1.setTypeParserId(1);
        TaskPropertyEntity prop2 = new TaskPropertyEntity(2, "process", 2);
        db.persistObject(prop1);
        db.persistObject(prop2);
        TaskStateEntity s1 = new TaskStateEntity();
        s1.setId(2);
        s1.setStateDescription("My Descr");
        s1.setStateTitle("Prerelease");
        List<TaskProperty> props = new ArrayList<>();
        props.add(prop2);
        props.add(prop1);
        s1.setRequiredProperties(props);
        db.persistObject(s1);
    }
    
    @Test
    public void testHostingspace() {
        HostingSpaceEntity e = new HostingSpaceEntity();
        e.setName("My Company 2");
        e.setState(EntryStates.Valid);
        db.persistObject(e);
        LOG.info("e is now " + e);
    }
    
    @Test
    public void testProjectCategory() {
        ProjectCategoryEntity e = new ProjectCategoryEntity();
        e.setTitle("Mutual 1");
        e.setEntryState(EntryStates.Valid);
        db.persistObject(e);
    }
}
