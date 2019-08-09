package com.hibernatedemo.exc.dao;

import com.hibernatedemo.exc.model.Messages;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author raj
 */
public class MessageDao {
    
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Messages");
    
    EntityManager em = emf.createEntityManager();
    
    public void saveMessage(Messages message){
        em.getTransaction().begin();
        em.persist(message);
        em.getTransaction().commit();
    }
    
    public Messages getMessage(Long id){
        em.getTransaction().begin();
        Messages hw = em.find(Messages.class, id);
        em.getTransaction().commit();
        return hw;
    }
}
