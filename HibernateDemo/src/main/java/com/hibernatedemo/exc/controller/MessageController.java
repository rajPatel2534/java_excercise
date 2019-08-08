/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernatedemo.exc.controller;

import com.hibernatedemo.exc.dao.MessageDao;
import com.hibernatedemo.exc.model.Messages;

/**
 *
 * @author raj
 */

public class MessageController {
    
    private MessageDao messageDao = new MessageDao();    
    
    public void saveMessage(){
        messageDao.saveMessage(new Messages("2nd message"));
    }
    
    public void getMessage(Long id){
        System.out.println(messageDao.getMessage(id).toString());
    }
}
