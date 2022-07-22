package com.sunnymix.coding.mapstruct.quickstart;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {

    AccountMapper MAPPER = Mappers.getMapper(AccountMapper.class);

    @Mappings({
            @Mapping(target = "givenName", source = "firstName"),
            @Mapping(target = "familyName", source = "lastName")
    })
    AccountDto toDto(Account account);

}
