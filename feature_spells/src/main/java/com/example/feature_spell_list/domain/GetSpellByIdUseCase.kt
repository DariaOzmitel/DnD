package com.example.feature_spell_list.domain

import com.example.core_model.Spell
import kotlinx.coroutines.flow.Flow

class GetSpellByIdUseCase(
    private val repository: SpellRepository
) {
    operator fun invoke(id: String): Flow<Spell> {
        return repository.getSpellById(id)
    }
}