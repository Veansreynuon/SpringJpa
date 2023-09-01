package com.example.homework.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "roles_authorities")
public class RoleAuthorities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authorities_id")
    private Integer authoritiesId;
    @Column(name = "role_id")
    private Integer roleId;
}
