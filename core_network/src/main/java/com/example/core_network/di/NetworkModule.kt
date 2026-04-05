package com.example.core_network.di

import com.example.core_network.ApiFactory
import com.example.core_network.ApiService
import org.koin.dsl.module

val networkModule = module {
    single<ApiService> { ApiFactory.apiService }
}