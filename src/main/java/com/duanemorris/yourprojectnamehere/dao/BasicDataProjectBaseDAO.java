/**
 * 
 */
package com.duanemorris.yourprojectnamehere.dao;

import org.springframework.stereotype.Repository;

import com.duanemorris.generic.dao.GenericDAO;


/**
 * @author ads203
 * 
 * This is the basic interface that all other DAO inherit from. Should your app need
 * some universal method add it here
 *
 */
@Repository
public interface BasicDataProjectBaseDAO<T,ID> extends GenericDAO<T, ID> {


}
