/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.composite;

import com.exercise.composite.model.UserProfile;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 *
 * @author nihar
 */
public class MainClass {


    public static void main(String[] args) {
       EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();

        MainClass.createUser(entityManager);
        JPAUtility.shutdown();
    }
    
    public static void createUser(EntityManager entityManager) {
        
       
        entityManager.getTransaction().begin();
        entityManager.merge(new UserProfile("Patel ", "patel@argusoft.in", "123123123"));
        entityManager.getTransaction().commit();
        entityManager.close();
       
    }

}
