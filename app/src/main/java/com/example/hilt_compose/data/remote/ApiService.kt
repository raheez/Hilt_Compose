package com.example.hilt_compose.data.remote

import retrofit2.http.GET

interface ApiService {

    @GET("test")
    suspend fun doNetworkCall() {

    }
}