package br.com.orangetalents.authors

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpResponse.notFound
import io.micronaut.http.HttpResponse.ok
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue
import javax.transaction.Transactional

@Controller("/api/authors")
class SearchAuthorController(private val authorRepository: AuthorRepository) {

    @Get
    @Transactional
    fun searchAuthors(@QueryValue(defaultValue = "") email: String): HttpResponse<Any> {
        if (email.isBlank()) {
            val authors = authorRepository.findAll()
            val response = authors.map { author -> AuthorDetailsResponse(author) }
            return ok(response)
        }

        val maybeAuthor = authorRepository.fetchByEmail(email)
        if (maybeAuthor.isEmpty) {
            return notFound()
        }
        val author = maybeAuthor.get()
        return ok(AuthorDetailsResponse(author))
    }
}