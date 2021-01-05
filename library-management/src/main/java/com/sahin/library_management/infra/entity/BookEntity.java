package com.sahin.library_management.infra.entity;

import java.time.LocalDate;
import java.util.Set;

public class BookEntity {
    private Long id;
    private String title;
    private LocalDate publicationDate;
    private Set<BookCategoryEntity> categories;
    private AuthorEntity author;
}
