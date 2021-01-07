package com.sahin.library_management.infra.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountEntity {

    private Long id;
    private LibraryCardEntity libraryCard;
    private String name;
    private String surname;
    private String email;
    private String phone;
}
