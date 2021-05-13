package br.com.orangetalents.authors

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpResponse.badRequest
import io.micronaut.http.HttpResponse.created
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.uri.UriBuilder
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("/api/authors")
class RegisterAuthorController(
    val authorRepository: AuthorRepository,
    val addressClient: AddressClient
) {

    @Post
    fun registerAuthor(@Body @Valid request: NewAuthorRequest): HttpResponse<Any> {

        val addressResponse = addressClient.consult(request.cep)
        if(addressResponse.body() == null){
            return badRequest()
        }

        val author = request.toAuthor(addressResponse.body()!!)
        authorRepository.save(author)

        val uri = UriBuilder.of("/api/authors/{id}")
            .expand(mutableMapOf(Pair("id", author.id)))

        return created(uri)
    }
}