package com.example.homework.Service;

import com.example.homework.dto.CreateAccountDto;
import com.example.homework.dto.TransferAccountDto;
import com.example.homework.entity.Account;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;

public interface AccountService {
    EntityModel<?> findByUuidAccount(String uuid);
    CollectionModel<?> findAllAccounts();
    EntityModel<?> disableAccount(String uuid);
    Account CreateAccount (CreateAccountDto createAccountDto);
    Account TransferAccountDto (String uuid, TransferAccountDto transferAccountDto);
}
