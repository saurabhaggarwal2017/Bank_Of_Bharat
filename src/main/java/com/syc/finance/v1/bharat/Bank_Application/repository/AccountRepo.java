package com.syc.finance.v1.bharat.Bank_Application.repository;

import com.syc.finance.v1.bharat.Bank_Application.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepo extends JpaRepository<Account,String> {
    Optional<Account> findByAccountNumberAndIfscCode(String accountNumber,String ifscCode);
    Optional<Account> findByAccountNumber(String accountNumber);
}
