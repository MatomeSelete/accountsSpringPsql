package com.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Logic {
    @Autowired
    private Repository repository;

    public List<Entity.Account> getAccounts(){
        return repository.findAll();
    }
}
