package com.sahin.library_management.infra.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookItemEntity {
    private String barcode;
    private BookEntity book;
    private RackEntity rack;
}
