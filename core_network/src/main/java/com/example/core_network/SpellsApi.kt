package com.example.core_network

import com.example.core_network.models.SpellDto
import retrofit2.http.GET

interface ApiService {
    @GET("9a340bfaed19599fcae31570c77b6db0420eaa13/spell_0.json")
    suspend fun getSpells(): List<SpellDto>
}