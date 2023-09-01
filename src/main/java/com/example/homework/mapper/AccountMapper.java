package com.example.homework.mapper;

import com.example.homework.dto.AccountDto;
import com.example.homework.dto.CreateAccountDto;
import com.example.homework.dto.TransferAccountDto;
import com.example.homework.dto.UserDto;
import com.example.homework.entity.Account;
import com.example.homework.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class) ;

    AccountDto accountDtoToAccount(Account account );

    List<AccountDto> listUserDtoToUser(List<Account> accounts);
    Account accountToCreateAccount(CreateAccountDto createAccountDto);
    Account AccountDtoToAccount(AccountDto AccountDto);
    Account limitTransferAccountDtoToAccount(TransferAccountDto TransferAccountDto);

}
