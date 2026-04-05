package com.example.feature_spell_list.data

import android.util.Log
import com.example.core_model.Spell
import com.example.core_network.ApiService
import com.example.feature_spell_list.domain.SpellRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

class SpellRepositoryImpl(
    private val apiService: ApiService
) : SpellRepository {
    override fun getSpells(): Flow<List<Spell>> = flow {
        emit(apiService.getSpells().toDomain())
    }.catch { e ->
        Log.e("SpellList", "$e")
        emit(emptyList())
    }

    override fun getSpellById(id: String): Flow<Spell> {
        val spellList = getSpells()
        return spellList.map {
            it.firstOrNull { spell -> spell.id == id }
                ?: throw NoSuchElementException("Spell with id $id not found")
        }
    }
}