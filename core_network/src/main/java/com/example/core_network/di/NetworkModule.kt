package com.example.core_network.di

import com.example.core_network.SpellsApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
    }

    @Singleton
    @Provides
    fun provideSpellsApi(retrofit: Retrofit): SpellsApi =
        retrofit.create(SpellsApi::class.java)
}

private const val BASE_URL =
    "https://gist.githubusercontent.com/DariaOzmitel/b2625b237726ccc04a81efb06aef89b3/raw/"