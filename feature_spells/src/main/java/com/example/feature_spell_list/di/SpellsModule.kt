package com.example.feature_spell_list.di

import com.example.feature_spell_list.data.SpellRepositoryImpl
import com.example.feature_spell_list.domain.GetSpellsUseCase
import com.example.feature_spell_list.domain.SpellRepository
import com.example.feature_spell_list.presentation.screens.spellList.SpellListViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val spellsModule = module {

    singleOf(::SpellRepositoryImpl) bind SpellRepository::class
    factoryOf(::GetSpellsUseCase)
    viewModelOf(::SpellListViewModel)
}