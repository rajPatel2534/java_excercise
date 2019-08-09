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
    
    public Messages getMessage(Long id){
        return messageDao.getMessage(id);
    }
}
