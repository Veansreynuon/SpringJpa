package com.example.homework.dto;

import com.example.homework.entity.UserAccount;

import java.util.List;

public record CreateUserDto(

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

                            List<UserAccount> usersAccounts) {
}
