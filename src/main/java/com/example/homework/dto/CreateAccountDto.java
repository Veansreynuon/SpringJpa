package com.example.homework.dto;

import com.example.homework.entity.AccountType;
import com.example.homework.entity.UserAccount;

import java.util.List;

public record CreateAccountDto(Long id,
                               String actName,
                               String actNo,
                               Double transferLimit,
                               String pin,
                               String uuid,
                               List<UserAccount> userAccounts,
                               AccountType accountTypes) {
}
