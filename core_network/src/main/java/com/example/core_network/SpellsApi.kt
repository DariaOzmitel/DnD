package com.example.core_network

import com.example.core_network.models.SpellDto
import retrofit2.http.GET

interface SpellsApi {
    @GET("03274496e138fa73580882e7d206e652f9801cfc/spell_0.json")
    suspend fun getSpells(): List<SpellDto>
}