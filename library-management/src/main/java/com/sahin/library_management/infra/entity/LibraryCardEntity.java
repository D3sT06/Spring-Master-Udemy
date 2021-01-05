package com.sahin.library_management.infra.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LibraryCardEntity {
    private String barcode;
    private Long issuedAt;
    private String password;
    private Boolean active;
}
