package br.com.orangetalents.authors

import br.com.orangetalents.validators.Cep
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Introspected
data class NewAuthorRequest(
    @field:NotBlank val name: String,
    @field:NotBlank @field:Email val email: String,
    @field:NotBlank @field:Size(max = 400) val description: String,
    @field:NotBlank @field:Cep val cep: String,
    @field:NotBlank val number: String
) {
    fun toAuthor(addressResponse: AddressResponse): Author {
        val address = Address(addressResponse, number)
        return Author(name, email, description, address)
    }
}
