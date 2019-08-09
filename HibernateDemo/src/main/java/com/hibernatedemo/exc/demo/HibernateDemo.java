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
    }
}
