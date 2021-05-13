package br.com.orangetalents.authors

import javax.persistence.Embeddable

@Embeddable
class Address(
    addressResponse: AddressResponse,
    val number: String
) {
    val street = addressResponse.logradouro
    val city = addressResponse.localidade
    val state = addressResponse.uf
}
