package com.example.homework.dto;

import com.example.homework.entity.AccountType;
import com.example.homework.entity.Transaction;
import com.example.homework.entity.UserAccount;
import lombok.Builder;

import java.util.List;

@Builder
public record AccountDto (
        Long id,
        String uuid,
        String accountName,
        String accountNumber,
        Integer transferLimit,

        String pin,
       AccountType accountType,
        List<Transaction> transactions,
        List<UserAccount> accounts
    ){
}
