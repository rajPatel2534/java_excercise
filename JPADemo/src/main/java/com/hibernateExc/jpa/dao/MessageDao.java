/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateExc.jpa.dao;

import com.hibernateExc.jpa.main.JPAUtility;
import com.hibernateExc.jpa.model.Messages;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author raj
 */
public class MessageDao {
         
    EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();

  
    public void saveMessage(Messages message){
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.merge(message);
        entityManager.getTransaction().commit();
    }
    
    public Messages getMessage(Long id){
        Messages hw = entityManager.find(Messages.class, id);
        return hw;
    }

    @Override
    protected void finalize() throws Throwable {
        entityManager.close();
        JPAUtility.shutdown();
    }
    
    
}
