package com.example.feature_spell_list.presentation.screens.spellList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_spell_list.domain.GetSpellsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class SpellListViewModel(
    private val getSpellsUseCase: GetSpellsUseCase
) : ViewModel() {
    private val stateMutable = MutableStateFlow<SpellListState>(SpellListState.Loading)
    val state: StateFlow<SpellListState> = stateMutable

    init {
        getSpells()
    }

    private fun getSpells() {
        viewModelScope.launch {
            getSpellsUseCase().collect { spellList ->
                stateMutable.update {
                    SpellListState.Content(spellList)
                }
            }
        }
    }
}