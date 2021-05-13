package br.com.orangetalents.authors

import io.micronaut.data.annotation.Query
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface AuthorRepository : JpaRepository<Author, Long> {
    fun findByEmail(email: String): Optional<Author>

    @Query("SELECT a FROM Author a WHERE a.email = :email")
    fun fetchByEmail(email: String): Optional<Author>
}