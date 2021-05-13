package br.com.orangetalents.authors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbr/com/orangetalents/authors/DeleteAuthorController;", "", "authorRepository", "Lbr/com/orangetalents/authors/AuthorRepository;", "(Lbr/com/orangetalents/authors/AuthorRepository;)V", "deleteAuthor", "Lio/micronaut/http/HttpResponse;", "id", "", "desafio-casa-do-codigo"})
@io.micronaut.http.annotation.Controller(value = "api/authors/{id}")
public class DeleteAuthorController {
    private final br.com.orangetalents.authors.AuthorRepository authorRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Delete()
    public io.micronaut.http.HttpResponse<java.lang.Object> deleteAuthor(@io.micronaut.http.annotation.PathVariable()
    long id) {
        return null;
    }
    
    public DeleteAuthorController(@org.jetbrains.annotations.NotNull()
    br.com.orangetalents.authors.AuthorRepository authorRepository) {
        super();
    }
}