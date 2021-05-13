package br.com.orangetalents.authors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lbr/com/orangetalents/authors/AuthorRepository;", "Lio/micronaut/data/jpa/repository/JpaRepository;", "Lbr/com/orangetalents/authors/Author;", "", "fetchByEmail", "Ljava/util/Optional;", "email", "", "findByEmail", "desafio-casa-do-codigo"})
@io.micronaut.data.annotation.Repository()
public abstract interface AuthorRepository extends io.micronaut.data.jpa.repository.JpaRepository<br.com.orangetalents.authors.Author, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<br.com.orangetalents.authors.Author> findByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.data.annotation.Query(value = "SELECT a FROM Author a WHERE a.email = :email")
    public abstract java.util.Optional<br.com.orangetalents.authors.Author> fetchByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
}