package com.example.homework.controller;

import com.example.homework.Service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/accounts")
public class AccountController {
    private final AccountService accountService;

    public CollectionModel<?> findAccount(){
        return accountService.findAllAccounts();
    }
//    public EntityModel<?> findAccountById(@PathVariable("uuid") String uuid){
//        EntityModel account = accountService.disableAccount(uuid);
//        Link link = linkTo(methodOn((AccountController.class).dis))
//    }


}
