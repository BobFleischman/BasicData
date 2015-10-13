package com.duanemorris.yourprojectnamehere;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
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
import com.duanemorris.yourprojectnamehere.service.DataObjectService;

/**
 * Unit test for simple App.
 */
@ContextConfiguration(classes={TestConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class DataObjectServiceTest 
{

	@Autowired
	DataObjectService dataObjectService;
    /**
     * Rigourous Test :-)
     */
	@Before
	public void setupDB() {
		List<DataObject> lst = new ArrayList<DataObject>();
		DataObject datao = new DataObject();
		datao.setSomeData("Something here");
		lst.add(datao);
		lst.add(new DataObject("Something borrowed"));
		lst.add(new DataObject("Something blue"));
		lst.add(new DataObject("Something old"));
		lst.add(new DataObject("Something new"));
		dataObjectService.persistAll(lst);		
	}
	
	@Test
	@Rollback(true)
	/*
	 * We need the transaction here since the setupDB is using the dataObjectService which is all transactional
	 * and if we want the test to rollback there must be an overridding transaction.
	 */
	@Transactional(value="transactionManagerBasicDataProject")
	public void testService() {
		assertTrue(dataObjectService.count() > 0);
		System.out.println(dataObjectService.count());
	}
}
