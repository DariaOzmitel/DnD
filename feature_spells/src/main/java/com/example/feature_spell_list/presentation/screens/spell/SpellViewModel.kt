package com.example.feature_spell_list.presentation.screens.spell

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_spell_list.domain.GetSpellByIdUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class SpellViewModel(
    private val getSpellByIdUseCase: GetSpellByIdUseCase
) : ViewModel() {
    private val stateMutable = MutableStateFlow<SpellState>(SpellState.Loading)
    val state: StateFlow<SpellState> = stateMutable

    init {
        getSpell("")
    }

    private fun getSpell(id: String) {
        viewModelScope.launch {
            getSpellByIdUseCase(id).collect { spell ->
                stateMutable.update {
                    SpellState.Content(spell)
                }
            }
        }
    }
}