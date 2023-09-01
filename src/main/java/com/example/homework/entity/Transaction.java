package com.example.homework.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer amount;
    @Column(name = "is_payment")
    private Boolean isPayment;
    @Column(name = "receiver_act_id")
    private Integer receiverAccountId;
    @Column(name = "sender_act_id")
    private Integer senderAccountId;
    private LocalDateTime transactions;
    private String remark;
    @Column(name = "student_card_no")
    private String studentCardNo;
    private String uuid;

    @ManyToOne
    private Account account;

}
