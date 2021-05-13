package br.com.orangetalents.authors

import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import javax.inject.Inject

/**
 * Estratégias:
 * louça: sujou, limpou -> @AfterEach
 * louça: limpou, usou -> @BeforeEach
 * louça: uso louça descartável -> rollback = true
 * louça: uso louça, jogo fora e compro nova -> recriar banco a cada teste
 */

@MicronautTest
internal class SearchAuthorControllerTest {

    @field:Inject
    @field:Client("/")
    lateinit var client: HttpClient

    @field:Inject
    lateinit var repository: AuthorRepository

    lateinit var author: Author

    @BeforeEach
    fun setup() {
        val addressResponse = AddressResponse("Wall Street", "New York", "NY")
        val address = Address(addressResponse, "15")
        author = Author("Foo", "foo@mail.com", "foo is bar and fool", address)

        repository.save(author)
    }

    @AfterEach
    fun tearDown() {
        repository.deleteAll()
    }

    @Test
    internal fun `must return status code 200 and author details response`() {
        val response =
            client.toBlocking().exchange("/api/authors?email=${author.email}", AuthorDetailsResponse::class.java)

        assertEquals(HttpStatus.OK, response.status)
        assertNotNull(response.body()!!)
        assertEquals(author.name, response.body()!!.name)
        assertEquals(author.email, response.body()!!.email)
        assertEquals(author.description, response.body()!!.description)

    }
}