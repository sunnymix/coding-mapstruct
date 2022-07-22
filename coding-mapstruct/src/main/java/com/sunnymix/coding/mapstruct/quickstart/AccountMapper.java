package com.sunnymix.coding.mapstruct.quickstart;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {

    AccountMapper MAPPER = Mappers.getMapper(AccountMapper.class);

    @Mappings({
            @Mapping(target = "familyName", source = "lastName"),
            @Mapping(target = "givenName", expression = "java(account.getFirstName() + \" \" + account.getMiddleName())"),
            @Mapping(target = "fullName", expression = "java(account.getFirstName() + \" \" + account.getMiddleName() + \" \" + account.getLastName())")
    })
    AccountDto toDto(Account account);

}
