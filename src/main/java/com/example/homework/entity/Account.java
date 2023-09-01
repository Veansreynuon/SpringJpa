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
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "transfer_limit")
    private Integer transferLimit;
    @Column(name = "account_name")
    private String accountName;
    @Column(name = "act_no")
    private String accountNo;
    private String pin;
    private String uuid;

    @ManyToOne
            @JoinColumn(name = "acc_type_id")
    AccountType accountType;

    @OneToMany(mappedBy = "account")
    private List<UserAccount> accounts;

    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions;
}
