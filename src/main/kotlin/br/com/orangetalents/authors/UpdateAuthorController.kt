package br.com.orangetalents.authors

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpResponse.notFound
import io.micronaut.http.HttpResponse.ok
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Put
import javax.transaction.Transactional

@Controller("/api/authors")
class UpdateAuthorController(private val authorRepository: AuthorRepository) {

    @Put("/{id}")
    @Transactional
    fun updateAuthor(@PathVariable id: Long, description: String): HttpResponse<Any> {
        val maybeAuthor = authorRepository.findById(id)
        if (maybeAuthor.isEmpty) {
            return notFound()
        }

        val author = maybeAuthor.get()
        description.also { author.description = it }

        authorRepository.update(author)
        return ok(AuthorDetailsResponse(author))
    }
}