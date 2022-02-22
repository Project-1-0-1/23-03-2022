package com.example.chitchat;

public class Message {
    private String messageId, message, senderId;
    private long timestamp;

    public Message(){

    }

    public Message(String message, String senderId, long timestamp) {

        this.message = message;
        this.senderId = senderId;
        this.timestamp = timestamp;
    }
    public String getMessageId(){
        return messageId;
    }
    public String getMessage(){
        return message;
    }
    public String getSenderId(){
        return senderId;
    }
    public long getTimestamp(){
        return timestamp;
    }
    public void setMessageId(String messageId){
        this.messageId=messageId;
    }
    public void setMessage(String message){
        this.message=message;
    }
    public  void setSenderId(String senderId){
        this.senderId=senderId;
    }
    public void setTimestamp(long timestamp){
        this.timestamp=timestamp;
    }
}
