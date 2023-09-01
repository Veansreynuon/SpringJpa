package com.example.homework.repository;

import com.example.homework.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByIsDeletedIsFalse();
    Optional<User> findByUuid(String uuid);


}

