package com.example.hilt_compose.domain.Repository

interface MyRepository {
    suspend fun doNetworkCall()
}