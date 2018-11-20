package com.company;

import java.security.Timestamp;

public class Message {
    //member variables
    private User writer;
    private String text;
    private Timestamp timePosted;
    private User receiver;
    private Group postedOn;
    private Account accnt;

    //Constructor
    public Message(User writer, String text, Timestamp timePosted, Account account){
        this.writer = writer;
        this.text = text;
        this.timePosted = timePosted;
        this.receiver = null;
        this.postedOn = null;
        this.accnt = account;
    }

    //compile-time polymorphism will happen, based on what parameter is passed in
    //@param - the User who will receive the message
    //@return - the Message that will be received by the user
    public Message sentTo(User receiver){
        this.receiver = receiver;
        return this;
    }

    //compile-time polymorphism will happen, based on what parameter is passed in
    //@param - the Group on which the Message will be posted
    //@return - the Message that will be posted
    public Message sentTo(Group grop){
        this.postedOn = grop;
        return this;
    }

    //getter for the writer of the message
    public User getWriter(){
        return this.writer;
    }

    //getter for the comment's text
    public String getText(){
        return this.text;
    }

    //getter for the time, the message was posted
    public Timestamp getTimePosted(){
        return this.timePosted;
    }

    //getter for the account the message belongs to
    public Account getAccnt(){
        return this.accnt;
    }

    //getter for the user that will receive the message
    public User getReceiver(){
        return this.receiver;
    }

    //getter for the group to which the message will be posted in
    public Group getPostedOn(){
        return this.postedOn;
    }


}
