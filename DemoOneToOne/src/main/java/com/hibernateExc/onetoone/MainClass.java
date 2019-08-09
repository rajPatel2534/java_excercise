package com.hibernateExc.onetoone;

import com.hibernateExc.onetoone.model.Address;
import com.hibernateExc.onetoone.model.Education;
import com.hibernateExc.onetoone.model.Student;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author raj
 */
public class MainClass {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(MainClass.class.getName());

        EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();

        MainClass.saveStudent(entityManager);
        MainClass.getStudent(entityManager).forEach(System.out::println);

        JPAUtility.shutdown();
    }

    /**
     * Save New Student
     *
     * @param entityManager
     */
    public static void saveStudent(EntityManager entityManager) {

        entityManager.getTransaction().begin();
        entityManager.merge(new Student("Patel", "Mr.", " ",
                "patel@argusoft.in", "95565656", new Address(
                        "222", "Shree", "mehasana", "gujarat", "india"),
                new Education("BE", "new", "NA", "2015", "GIT")));
        entityManager.getTransaction().commit();
    }

    /**
     *
     * @param entityManager
     * @return Students List
     */
    public static List<Student> getStudent(EntityManager entityManager) {

        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("from Student");

        List<Student> students = query.getResultList();
        entityManager.getTransaction().commit();

        return students;
    }

}
