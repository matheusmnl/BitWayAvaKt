package com.example.clientktapi.repository

import com.example.clientktapi.entities.ClientKtEntities
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository : JpaRepository<ClientKtEntities, Long> {
}