package com.example.homework.dto;

import com.example.homework.entity.AccountType;
import com.example.homework.entity.Transaction;
import com.example.homework.entity.UserAccount;
import lombok.Builder;

import java.util.List;
@Builder
public record UserDto(
        Integer id,

        String uuid,
        Boolean isDeleted,
        Boolean isStudent,
        Boolean isVerified,
        String email,
        String gender,
        String name,
        String OneSignalId,
        String phoneNumber,
        String verifiedCode,

        List<UserAccount> usersAccounts
) {
}
