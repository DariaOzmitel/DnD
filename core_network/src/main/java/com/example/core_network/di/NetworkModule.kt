package com.example.core_network.di

import com.example.core_network.ApiService
import com.example.core_network.SpellApiFactory
import org.koin.dsl.module

val networkModule = module {
    single<ApiService> { SpellApiFactory.apiService }
}