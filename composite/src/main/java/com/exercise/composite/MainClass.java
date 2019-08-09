package com.exercise.composite;

import com.exercise.composite.model.UserProfile;
import javax.persistence.EntityManager;

/**
 *
 * @author raj
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
