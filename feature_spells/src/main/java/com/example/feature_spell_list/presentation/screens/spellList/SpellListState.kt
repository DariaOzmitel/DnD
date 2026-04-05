package com.example.feature_spell_list.presentation.screens.spellList

import com.example.core_model.Spell

sealed class SpellListState {
    data class Content(
        val spellList: List<Spell>
    ) : SpellListState()

    object Loading : SpellListState()
}