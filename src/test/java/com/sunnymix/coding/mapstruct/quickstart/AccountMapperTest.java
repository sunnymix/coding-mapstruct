package com.sunnymix.coding.mapstruct.quickstart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountMapperTest {

    @Test
    public void testToDto() {
        Account account = new Account("FirstName", "MiddleName", "LastName");
        AccountDto accountDto = AccountMapper.MAPPER.toDto(account);
        assertEquals(accountDto.getGivenName(), "FirstName MiddleName");
        assertEquals(accountDto.getFamilyName(), "LastName");
        assertEquals(accountDto.getFullName(), "FirstName MiddleName LastName");
    }

}
