package br.com.orangetalents.authors

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpResponse.notFound
import io.micronaut.http.HttpResponse.ok
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.PathVariable
import javax.transaction.Transactional

@Controller("api/authors/{id}")
class DeleteAuthorController(private val authorRepository: AuthorRepository) {

    @Delete
    @Transactional
    fun deleteAuthor(@PathVariable id: Long): HttpResponse<Any> {
        val maybeAuthor = authorRepository.findById(id)
        if (maybeAuthor.isEmpty) return notFound()

        authorRepository.deleteById(id)
        return ok()
    }
}