package br.com.orangetalents.authors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lbr/com/orangetalents/authors/AddressClient;", "", "consult", "Lio/micronaut/http/HttpResponse;", "Lbr/com/orangetalents/authors/AddressResponse;", "cep", "", "desafio-casa-do-codigo"})
@io.micronaut.http.client.annotation.Client(value = "https://viacep.com.br/ws")
public abstract interface AddressClient {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    @io.micronaut.http.annotation.Consumes(value = {"application/json"})
    @io.micronaut.http.annotation.Get(value = "/{cep}/json")
    public abstract io.micronaut.http.HttpResponse<br.com.orangetalents.authors.AddressResponse> consult(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String cep);
}