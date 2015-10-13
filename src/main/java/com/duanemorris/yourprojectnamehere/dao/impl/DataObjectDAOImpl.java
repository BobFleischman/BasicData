package com.duanemorris.yourprojectnamehere.dao.impl;

import org.springframework.stereotype.Repository;

import com.duanemorris.yourprojectnamehere.bo.DataObject;
import com.duanemorris.yourprojectnamehere.dao.DataObjectDAO;

@Repository
public class DataObjectDAOImpl extends BasicDataProjectBaseDAOImpl<DataObject, Long> implements DataObjectDAO {

	public DataObjectDAOImpl() {
    	super(DataObject.class);
    	setOrderByFieldName(DataObject.PROP_ID);
    }

}
