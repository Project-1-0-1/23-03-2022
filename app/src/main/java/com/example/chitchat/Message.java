package com.example.chitchat;

public class Message {
    private String messageId, message, senderId;
    private long timestamp;

    public Message(){

    }

    public Message(String messageId, String message, String senderId, long timestamp) {
        this.messageId = messageId;
        this.message = message;
        this.senderId = senderId;
        this.timestamp = timestamp;
    }
    public String getMessageId(){
        return messageId;
    }
    public String message(){
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
