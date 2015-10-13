/**
 * 
 */
package com.duanemorris.yourprojectnamehere.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.duanemorris.generic.dao.hibernate.GenericHibernateDAOImpl;
import com.duanemorris.yourprojectnamehere.dao.BasicDataProjectBaseDAO;

/**
 * @author ads203
 *
 */
@Repository
public abstract class BasicDataProjectBaseDAOImpl<T,ID> extends GenericHibernateDAOImpl<T, ID> implements BasicDataProjectBaseDAO<T, ID>{

    public BasicDataProjectBaseDAOImpl(Class<T> pClazz) {
        super(pClazz);
    }

    public BasicDataProjectBaseDAOImpl() {
        super();
    }

	@Override
    @Autowired
    @Qualifier("sessionFactoryBasicDataProject")
    public void setSessionFactory(SessionFactory sf) {
        sessionFactory = sf;
    }
}
