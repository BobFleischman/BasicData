/**
 * 
 */
package com.duanemorris.yourprojectnamehere.service;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.duanemorris.generic.utils.DMOrder;


/**
 * @author ads203
 * 
 * This is the basic interface that all other DAO inherit from. Should your app need
 * some universal method add it here
 *
 */
@Component
public interface BasicDataProjectBaseService<T,ID> {

    public T find(ID id);
    public void persist(T object);
    public void persistAll(Collection<T> collection);
    public void remove(T object);
    public void removeAll(Collection<T> collection);
    public T merge(T object);

    public List<T> findAll(DMOrder... orders);
    public List<T> findAll();
    
    public Long count();
        
}
