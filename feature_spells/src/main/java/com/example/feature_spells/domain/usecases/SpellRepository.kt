package com.example.feature_spells.domain.usecases

import com.example.core_model.Spell
import kotlinx.coroutines.flow.Flow

interface SpellRepository {
    fun getSpells(): Flow<List<Spell>>
}