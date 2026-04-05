package com.example.feature_spells.domain.usecases

import com.example.core_model.Spell
import kotlinx.coroutines.flow.Flow

class GetSpellsUseCase(
    private val repository: SpellRepository
) {
    operator fun invoke(): Flow<List<Spell>> =
        repository.getSpells()
}
