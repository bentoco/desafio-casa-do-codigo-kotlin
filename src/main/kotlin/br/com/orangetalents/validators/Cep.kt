package br.com.orangetalents.validators

import javax.validation.Constraint
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.*
import kotlin.reflect.KClass

@MustBeDocumented
@Target(FIELD, CONSTRUCTOR)
@Retention(RUNTIME)
@Constraint(validatedBy = [CepValidator::class])
annotation class Cep(
    val message: String = "invalid cep",
    val groups: Array<KClass<Any>> = [],
    val payload: Array<KClass<Any>> = [],
)
