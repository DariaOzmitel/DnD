package com.example.feature_spell_list.presentation.screens.spell

import com.example.core_model.Spell

sealed class SpellState {
    data class Content(
        val spell: Spell
    ) : SpellState()

    object Loading : SpellState()
}