package br.com.orangetalents.authors

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "author")
class Author(
    val name: String,
    val email: String,
    var description: String,
    val address: Address
) {
    @Id
    @GeneratedValue
    val id: Long? = null

    val createdAt: LocalDateTime = LocalDateTime.now()
}