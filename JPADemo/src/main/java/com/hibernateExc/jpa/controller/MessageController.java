package com.hibernateExc.jpa.controller;

import com.hibernateExc.jpa.dao.MessageDao;
import com.hibernateExc.jpa.model.Messages;

/**
 *
 * @author raj
 */

public class MessageController {
    
    private MessageDao messageDao = new MessageDao();
        
    
    public void saveMessage(){
        messageDao.saveMessage(new Messages("jpa"));
    }
    
    public Messages getMessage(Long id){
       return messageDao.getMessage(id);
    }
    
   
}
