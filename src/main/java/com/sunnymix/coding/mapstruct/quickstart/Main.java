package com.sunnymix.coding.mapstruct.quickstart;

public class Main {

    public static void main(String[] args) {
        Account account = new Account("FirstName", "MiddleName", "LastName");
        AccountDto accountDto = AccountMapper.MAPPER.toDto(account);
        System.out.println(accountDto);
    }

}
