package com.example.feature_spells.data

import com.example.core_model.Spell
import com.example.feature_spells.domain.usecases.SpellRepository
import kotlinx.coroutines.flow.Flow

class SpellRepositoryImpl : SpellRepository {
    override fun getSpells(): Flow<List<Spell>> {
        TODO("Not yet implemented")
    }
}