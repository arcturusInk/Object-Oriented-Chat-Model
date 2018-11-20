package com.company;

public class Account {
    //member variables
    private String orgName;
    private String adminName; //(i.e. the person who create the account is admin by default)

    //Constructor
    public Account(String orgName, String admin){
        this.orgName = orgName;
        this.adminName = admin;
    }

    //getter for Account's name
    public String getOrgName(){
        return this.orgName;
    }

    //getter for admin's name (the person who created the account)
    public String getAdmin(){
        return this.adminName;
    }
}
