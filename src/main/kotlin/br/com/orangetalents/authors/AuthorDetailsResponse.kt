package br.com.orangetalents.authors

data class AuthorDetailsResponse(
    val name: String = "",
    val email: String = "",
    val description: String = "",
) {
    constructor(author: Author) : this(author.name, author.email, author.description)
}