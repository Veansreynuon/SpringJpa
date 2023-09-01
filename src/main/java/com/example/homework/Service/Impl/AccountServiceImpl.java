package com.example.homework.Service.Impl;

import com.example.homework.Service.AccountService;
import com.example.homework.dto.CreateAccountDto;
import com.example.homework.dto.TransferAccountDto;
import com.example.homework.entity.Account;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;

public class AccountServiceImpl implements AccountService {
    @Override
    public EntityModel<?> findByUuidAccount(String uuid) {
        return null;
    }

    @Override
    public CollectionModel<?> findAllAccounts() {
        return null;
    }

    @Override
    public EntityModel<?> disableAccount(String uuid) {
        return null;
    }

    @Override
    public Account CreateAccount(CreateAccountDto createAccountDto) {
        return null;
    }

    @Override
    public Account TransferAccountDto(String uuid, TransferAccountDto transferAccountDto) {
        return null;
    }
}
