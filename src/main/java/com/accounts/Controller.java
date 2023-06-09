package com.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/accounts")
public class Controller {
    @Autowired
    private Logic logic;

    @GetMapping()
    @ResponseBody()
    public List<Entity.Account> account() {
        return logic.getAccounts();
    }
}



//https://medium.com/javarevisited/getting-started-with-spring-boot-with-postgres-18f72612108c