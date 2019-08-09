package com.hibernateExc.jpa.main;

import com.hibernateExc.jpa.controller.MessageController;


/**
 *
 * @author raj
 */
public class MainApp {
    public static void main(String[] args) {
       MessageController messagesController = new MessageController();
       messagesController.saveMessage();
       JPAUtility.shutdown();
    }
}
