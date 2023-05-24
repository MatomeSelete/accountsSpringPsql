package com.accounts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import jakarta.persistence.Entity;

import java.util.Date;

import javax.xml.crypto.Data;
//import java.sql.Date;

public class Entity {

    @jakarta.persistence.Entity
    @Table(name="ACCOUNTS")
    public class Account {
        @Id @GeneratedValue
        private int userId;
        private String username;
        private String password;
        private String email;
        private Date createdOn;
        private Date lastLogin;

}}
