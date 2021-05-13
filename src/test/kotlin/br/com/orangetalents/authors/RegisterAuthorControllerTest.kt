package br.com.orangetalents.authors

import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import javax.inject.Inject

@MicronautTest
internal class RegisterAuthorControllerTest {

    @field:Inject
    @field:Client("/")
    lateinit var client: HttpClient

    @field:Inject
    lateinit var addressClient: AddressClient

    @Test
    internal fun `must create new author`() {

        val newRequest = NewAuthorRequest(
            "Foo",
            "foo@mail.com",
            "foo is bar and fool",
            "17250970",
            "10"
        )

        val addressResponse = AddressResponse("Wall Street", "New York", "NY")

        Mockito.`when`(addressClient.consult(newRequest.cep)).thenReturn(HttpResponse.ok(addressResponse))

        val request = HttpRequest.POST("/api/authors", newRequest)

        val response = client.toBlocking().exchange(request, Any::class.java)

        assertEquals(HttpStatus.CREATED, response.status)
        assertTrue(response.headers.contains("Location"))
        assertTrue(response.header("Location")!!.matches("/api/authors/\\d".toRegex()))
    }

    @MockBean(AddressClient::class)
    fun addressClient(): AddressClient {
        return Mockito.mock(AddressClient::class.java)
    }
}