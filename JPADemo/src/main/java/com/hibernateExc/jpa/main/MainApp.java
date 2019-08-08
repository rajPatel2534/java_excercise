/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        System.out.println(messagesController.getMessage(1L).toString());
        JPAUtility.shutdown();
    }
}
