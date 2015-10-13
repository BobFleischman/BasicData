package com.duanemorris.yourprojectnamehere;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.duanemorris.yourprojectnamehere.bo.DataObject;
import com.duanemorris.yourprojectnamehere.config.TestConfiguration;
import com.duanemorris.yourprojectnamehere.dao.DataObjectDAO;
import com.duanemorris.yourprojectnamehere.service.DataObjectService;

/**
 * Unit test for simple App.
 */
@ContextConfiguration(classes={TestConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class DataObjectDAOTest 
{

	@Autowired
	DataObjectDAO dataObjectDAO;
	
    /**
     * Rigourous Test :-)
     */
	
	@Before
	public void setupDB() {
		DataObject datao = new DataObject();
		datao.setSomeData("Something here");
		dataObjectDAO.persist(datao);
		datao = new DataObject();
		datao.setSomeData("Something borrowed");
		dataObjectDAO.persist(datao);		
		datao = new DataObject();
		datao.setSomeData("Something blue");
		dataObjectDAO.persist(datao);		
		datao = new DataObject();
		datao.setSomeData("Something old");
		dataObjectDAO.persist(datao);		
		datao = new DataObject();
		datao.setSomeData("Something new");
		dataObjectDAO.persist(datao);		
	}
	
	@Test
	@Transactional
    public void testApp()
    {
		List<DataObject> lst = dataObjectDAO.findAll();
		assertTrue(lst.size() > 0);
		for (DataObject dataObject : lst) {
			System.out.println(dataObject);
		}
        assertTrue( true );
    }
	
}
