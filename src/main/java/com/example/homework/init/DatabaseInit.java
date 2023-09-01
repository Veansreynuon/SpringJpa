package com.example.homework.init;

import com.example.homework.entity.Account;
import com.example.homework.entity.User;
import com.example.homework.repository.AccountRepository;
import com.example.homework.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DatabaseInit {
    private final UserRepository userRepository;
    private final AccountRepository accountRepository;

    @PostConstruct
    public void inti() {
        User user = User.builder().email("SreyNuon@gmail.com").name("Nuon").password(String.valueOf(UUID.randomUUID())).uuid(UUID.randomUUID().toString()).gender("Female").phoneNumber("017999999").isStudent(true).isVerified(true).studentCardNo("2498174uihsfk").isDeleted(false).OneSignalId("jasf;ahsfe3453uhfabfiaueg94328").build();
        User user2 = User.builder().email("kimkim@gmail.com").name("Nou").password(String.valueOf(UUID.randomUUID())).uuid(UUID.randomUUID().toString()).gender("Female").phoneNumber("017999999").isStudent(true).isVerified(true).studentCardNo("2498174uihsfk").isDeleted(false).OneSignalId("jasf;ahsfeuhf345abfiaueg94328").build();
        User user3 = User.builder().email("minmin@gmail.com").name("Ney").password(String.valueOf(UUID.randomUUID())).uuid(UUID.randomUUID().toString()).gender("Female").phoneNumber("017999999").isStudent(true).isVerified(true).studentCardNo("2498174uihsfk").isDeleted(false).OneSignalId("jasf;a5hsfeuhfabfiaueg94328").build();
        User user4 = User.builder().email("hing@gmail.com").name("vorn").password(String.valueOf(UUID.randomUUID())).uuid(UUID.randomUUID().toString()).gender("Female").phoneNumber("017999999").isStudent(true).isVerified(true).studentCardNo("2498174uihsfk").isDeleted(false).OneSignalId("jasf345;ahsfeuhfabfiaueg94328").build();
        User user5 = User.builder().email("jmin@gmail.com").name("liza").password(String.valueOf(UUID.randomUUID())).uuid(UUID.randomUUID().toString()).gender("Female").phoneNumber("017999999").isStudent(true).isVerified(true).studentCardNo("2498174uihsfk").isDeleted(false).OneSignalId("j345asf;ahsfeuhfabfiaueg94328").build();
        userRepository.saveAll(List.of(user, user2, user3, user4, user5));
    }
}