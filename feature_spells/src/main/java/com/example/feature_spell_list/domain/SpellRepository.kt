package com.example.feature_spell_list.domain

import com.example.core_model.Spell
import kotlinx.coroutines.flow.Flow

interface SpellRepository {
    fun getSpells(): Flow<List<Spell>>
}