package com.example.clientktapi.entities

import java.util.Date
import javax.persistence.Entity
import javax.persistence.Id


// entidade de persistência com as tabelas semelhante ao DAO ou repository
@Entity
data class ClientKtEntities(

    @Id
    var id: Long? = null,
    var firstName: String,
    var lastName: String,
    val cep: String,
    val registryDate: Date
)
