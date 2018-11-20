package com.company;

import java.util.ArrayList;

/*Caveat: Because of the way it's designed, an user uses the same name, email, passwd for all Accounts*/

public class User {
    //member variables
    private String firstName;
    private String lastName;
    private String email;
    private String passwd;
    private ArrayList<Account> memberOfThesesOrgs;
    private ArrayList<Message> messageSentToThisUser;

    //Constructor
    public User(String firstName, String lastName, String email, String passwd){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passwd = passwd;
        this.memberOfThesesOrgs = new ArrayList<>();
        this.messageSentToThisUser = new ArrayList<>();
    }

    //Determines if the user already belongs to an Account
    //@param - the Account to be tested
    //@return - returns true, if the user belongs to the Account, false otherwise
    public boolean isInAccount(Account anAccnt){
        return memberOfThesesOrgs.contains(anAccnt);
    }

    //Adds an Account to the user's ArrayList, if they want to join a new Account
    //Adding the User to the Account means the user belongs to that Organization
    //@param - the Account to be added
    public void addAccountToUser(Account anAccnt){
        if(!isInAccount(anAccnt)){
            memberOfThesesOrgs.add(anAccnt);
        }
    }

    //If the User wants to leave from the Account, deletes the account from the User's ArrayList
    //@param - the Account to be removed
    public void deleteAccountFromUser (Account anAccnt){
        if(isInAccount(anAccnt)){
            memberOfThesesOrgs.remove(anAccnt);
        }
    }

    //Deletes the user if they are not in any Account && and haven't posted a Message in a long time
    public void deleteUser(){
        if(memberOfThesesOrgs.size() == 0 /* && the timePosted of the last Message written by this User is really old */){
            //delete this user
        }
    }

    //Adds Messages sent to this User into an ArrayList
    //@param - the Message to be added to the arrayList
    public void addMessage(Message mess){
        messageSentToThisUser.add(mess);
    }

    //getter for user's first name
    public String getFirstName(){
        return this.firstName;
    }

    //getter for user's last name
    public String getLastName(){
        return this.lastName;
    }

    //getter for user's email
    public String getEmail(){
        return this.email;
    }

    //getter for user's password
    public String getPasswd(){
        return this.passwd;
    }

    //getter for the ArrayList that contains the accounts the user is in
    public ArrayList<Account> getMemberOfThesesOrgs(){
        return this.memberOfThesesOrgs;
    }

    //getter for the ArrayList that contains the messages sent to this user'
    public ArrayList<Message> getMessageSentToThisUser(){
        return this.messageSentToThisUser;
    }
}
