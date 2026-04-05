package com.example.feature_spell_list.domain

import com.example.core_model.Spell
import kotlinx.coroutines.flow.Flow

class GetSpellsUseCase(
    private val repository: SpellRepository
) {
    operator fun invoke(): Flow<List<Spell>> {
        return repository.getSpells()
    }
}