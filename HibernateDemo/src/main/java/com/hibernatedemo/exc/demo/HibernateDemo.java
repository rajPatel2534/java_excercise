/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernatedemo.exc.demo;

import com.hibernatedemo.exc.controller.MessageController;

/**
 *
 * @author raj
 */
public class HibernateDemo {

    public static void main(String[] args) {
        MessageController messageController = new MessageController();
        messageController.saveMessage();
        messageController.getMessage(1L);
    }
}
