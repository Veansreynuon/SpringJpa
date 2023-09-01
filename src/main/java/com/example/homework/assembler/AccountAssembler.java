package com.example.homework.assembler;

import com.example.homework.controller.AccountController;
import com.example.homework.controller.UserController;
import com.example.homework.dto.AccountDto;
import com.example.homework.dto.UserDto;
import com.example.homework.entity.Account;
import com.example.homework.mapper.AccountMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
@Configuration
public class AccountAssembler extends RepresentationModelAssemblerSupport<Account, EntityModel<AccountDto>> {
    private AccountMapper accountMapper;
    public void setAccountMapper(AccountMapper accountMapper){
        this.accountMapper = accountMapper;
    }
    public AccountAssembler() {
        super(AccountController.class, (Class<EntityModel<AccountDto>>) (Class<?>) EntityModel.class);
    }

    @Override
    public EntityModel<AccountDto> toModel(Account entity) {
//        Link link = linkTo(methodOn(UserController.class).getUserByUuid(entity.getUuid())).withSelfRel();
//        Link collection = linkTo(methodOn(UserController.class).getAccount()).withRel(IanaLinkRelations.COLLECTION);
        return null; //EntityModel.of(user,link,collection);
    }
}
