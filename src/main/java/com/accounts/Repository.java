package com.accounts;

import com.accounts.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Account, Integer> {

}