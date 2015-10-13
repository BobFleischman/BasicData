/**
 * 
 */
package com.duanemorris.yourprojectnamehere.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.duanemorris.generic.utils.DMOrder;
import com.duanemorris.yourprojectnamehere.bo.DataObject;
import com.duanemorris.yourprojectnamehere.dao.DataObjectDAO;
import com.duanemorris.yourprojectnamehere.service.DataObjectService;

/**
 * @author ads203
 *
 */
@Repository
@Transactional(value="transactionManagerBasicDataProject")
public class DataObjectServiceImpl implements DataObjectService {

	@Autowired
	DataObjectDAO dao;
	
	/* (non-Javadoc)
	 * @see com.duanemorris.yourprojectnamehere.service.BasicDataProjectBaseService#find(java.lang.Object)
	 */
	@Override
	public DataObject find(Long id) {
		return dao.find(id);
	}

	/* (non-Javadoc)
	 * @see com.duanemorris.yourprojectnamehere.service.BasicDataProjectBaseService#persist(java.lang.Object)
	 */
	@Override
	public void persist(DataObject object) {
		dao.persist(object);
	}

	/* (non-Javadoc)
	 * @see com.duanemorris.yourprojectnamehere.service.BasicDataProjectBaseService#persistAll(java.util.Collection)
	 */
	@Override
	public void persistAll(Collection<DataObject> collection) {
		dao.persistAll(collection);
	}

	/* (non-Javadoc)
	 * @see com.duanemorris.yourprojectnamehere.service.BasicDataProjectBaseService#remove(java.lang.Object)
	 */
	@Override
	public void remove(DataObject object) {
		dao.remove(object);
	}

	/* (non-Javadoc)
	 * @see com.duanemorris.yourprojectnamehere.service.BasicDataProjectBaseService#removeAll(java.util.Collection)
	 */
	@Override
	public void removeAll(Collection<DataObject> collection) {
		dao.removeAll(collection);
	}

	/* (non-Javadoc)
	 * @see com.duanemorris.yourprojectnamehere.service.BasicDataProjectBaseService#merge(java.lang.Object)
	 */
	@Override
	public DataObject merge(DataObject object) {
		return dao.merge(object);
	}

	/* (non-Javadoc)
	 * @see com.duanemorris.yourprojectnamehere.service.BasicDataProjectBaseService#findAll(com.duanemorris.generic.utils.DMOrder[])
	 */
	@Override
	public List<DataObject> findAll(DMOrder... orders) {
		return dao.findAll(orders);
	}

	/* (non-Javadoc)
	 * @see com.duanemorris.yourprojectnamehere.service.BasicDataProjectBaseService#findAll()
	 */
	@Override
	public List<DataObject> findAll() {
		return dao.findAll();
	}

	/* (non-Javadoc)
	 * @see com.duanemorris.yourprojectnamehere.service.BasicDataProjectBaseService#count()
	 */
	@Override
	public Long count() {
		return dao.count();
	}

}
