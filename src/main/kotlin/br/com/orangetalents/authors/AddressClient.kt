package br.com.orangetalents.authors

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Produces
import io.micronaut.http.client.annotation.Client

@Client("https://viacep.com.br/ws")
interface AddressClient {

    @Get("/{cep}/json")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun consult(@PathVariable cep: String): HttpResponse<AddressResponse>
}