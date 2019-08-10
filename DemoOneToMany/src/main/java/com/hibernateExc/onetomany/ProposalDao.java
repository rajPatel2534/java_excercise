package com.hibernateExc.onetomany;

import com.hibernateExc.onetomany.model.Attachment;
import com.hibernateExc.onetomany.model.Personnel;
import com.hibernateExc.onetomany.model.Proposal;
import com.hibernateExc.onetomany.model.QualificationLevel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author raj
 */
public class ProposalDao {

    EntityManager entityManager = JPAUtility.getEntityManagerFactory().createEntityManager();

    /**
     * 
     * @return new proposal
     */
    private Proposal createProposal() {

        byte[] myvar = "Enter Any String".getBytes();
        List<Personnel> personnel = new ArrayList<>();
        personnel.add(new Personnel("RajRaj", QualificationLevel.Beginner, "1232131223"));
        personnel.add(new Personnel("Patel", QualificationLevel.Beginner, "4312123456"));

        List<Attachment> attachment = new ArrayList<>();
        attachment.add(new Attachment("FILENAME", "100", myvar));
        Proposal proposal = new Proposal("Argusoft", "Hi", personnel, attachment);
        return proposal;
    }
    
    /**
     * 
     * @param id
     * @return proposal
     */
    private Proposal getOne(Long id) {

        return entityManager.getReference(Proposal.class, id);
    }
    
    /**
     * Add proposal
     */
    public void addProposal() {

        entityManager.getTransaction().begin();
        entityManager.merge(createProposal());
        entityManager.getTransaction().commit();

    }
    /**
     * 
     * @return List of proposal
     */
    public List<Proposal> getProposal() {

        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("from Proposal");
        List<Proposal> students = query.getResultList();
        entityManager.getTransaction().commit();
        return students;
    }
    /**
     * 
     * @param id 
     * Delete proposal
     */
    public void deleteProposal(Long id) {

        entityManager.getTransaction().begin();
        Proposal proposal = getOne(id);
        entityManager.remove(proposal);
        entityManager.getTransaction().commit();

    }
    
    /**
     * 
     * @param id 
     * Update proposal
     */
    public void updateProposal(Long id) {

        entityManager.getTransaction().begin();
        Proposal proposal = getOne(id);
        proposal.setTitle("title");
        entityManager.getTransaction().commit();

    }

}
