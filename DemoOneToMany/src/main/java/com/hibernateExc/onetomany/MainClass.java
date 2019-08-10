package com.hibernateExc.onetomany;

import java.util.logging.Logger;

/**
 *
 * @author raj
 */
public class MainClass {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(MainClass.class.getName());

        ProposalDao proposalDao = new ProposalDao();

        proposalDao.addProposal();
        logger.info("Proposal added");
        proposalDao.updateProposal(1L);
        logger.info("Proposal updated");
        proposalDao.getProposal().forEach(proposal -> logger.info(proposal.toString()));
        proposalDao.deleteProposal(1L);
        logger.info("Proposal Deleted");

        JPAUtility.shutdown();
    }

}
