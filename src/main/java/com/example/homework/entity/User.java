package com.example.homework.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "is_deletes")
    private Boolean isDeleted;
    @Column(name = "is_student")
    private Boolean isStudent;
    @Column(name = "is_verified")
    private Boolean isVerified;
    private String email;
    private String gender;
    private String name;
    @Column(name = "One_Signal_id")
    private String OneSignalId;
    private String password;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "student_Card_no")
    private String studentCardNo;
    private String uuid;
    @Column(name = "verified_code")
    private String verifiedCode;

    @OneToMany(mappedBy ="user")
    private List<UserAccount> usersAccounts;




}
