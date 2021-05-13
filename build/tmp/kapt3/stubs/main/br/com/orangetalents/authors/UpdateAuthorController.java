package br.com.orangetalents.authors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lbr/com/orangetalents/authors/UpdateAuthorController;", "", "authorRepository", "Lbr/com/orangetalents/authors/AuthorRepository;", "(Lbr/com/orangetalents/authors/AuthorRepository;)V", "updateAuthor", "Lio/micronaut/http/HttpResponse;", "id", "", "description", "", "desafio-casa-do-codigo"})
@io.micronaut.http.annotation.Controller(value = "/api/authors")
public class UpdateAuthorController {
    private final br.com.orangetalents.authors.AuthorRepository authorRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Put(value = "/{id}")
    public io.micronaut.http.HttpResponse<java.lang.Object> updateAuthor(@io.micronaut.http.annotation.PathVariable()
    long id, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
        return null;
    }
    
    public UpdateAuthorController(@org.jetbrains.annotations.NotNull()
    br.com.orangetalents.authors.AuthorRepository authorRepository) {
        super();
    }
}