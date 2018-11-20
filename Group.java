package com.company;

import java.util.ArrayList;

public class Group {
    //member variables
    private String groupName;
    private String description;
    private Account accnt;
    private ArrayList<User> usersInThisGroup;
    private ArrayList<Message> messagesPostedOnThisGroup;

    //Constructor
    public Group(String groupName, String description, Account account){
        this.groupName = groupName;
        this.description = description;
        this.accnt = account;
        this.usersInThisGroup = new ArrayList<>();
        this.messagesPostedOnThisGroup = new ArrayList<>();
    }

    //Adds a new member to the group's ArrayList
    //@param - the User to be added
    public void addMember(User aMember){
        //if the user is in the same account/organization as this group and is not already in the group
        if(aMember.isInAccount(accnt) && !usersInThisGroup.contains(aMember)){
            usersInThisGroup.add(aMember);
        }
    }

    //Removes an existing member from the group's ArrayList
    //@param - the User to be removed
    public void removeMemeber(User aMember){
        if(usersInThisGroup.contains(aMember)){
            usersInThisGroup.remove(aMember);
        }
    }

    //Adds Messages posted on this Group onto the Groups's ArrayList of messagesPostedOnThisGroup
    //@param - the Message to be added to the arrayList
    public void addMessage(Message mess){
        messagesPostedOnThisGroup.add(mess);
    }

    //getter for group's name
    public String getGroupName(){
        return this.groupName;
    }

    //getter for description of what the group is about
    public String getDescription(){
        return this.description;
    }

    //getter for the ArrayList that contains all the User's in the group
    public ArrayList<User> getUsersInThisGroup(){
        return this.usersInThisGroup;
    }

    //getter for the Account this group belongs in
    public Account getAccnt(){
        return this.accnt;
    }

    //getter for the ArrayList that contains all the Messages Posted on the group
    public ArrayList<Message> getMessagesPostedOnThisGroup(){
        return this.messagesPostedOnThisGroup;
    }
}
