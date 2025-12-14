package com.example.core_network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal object ApiFactory {

    private const val BASE_URL =
        "https://gist.githubusercontent.com/DariaOzmitel/b2625b237726ccc04a81efb06aef89b3/raw/"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    val apiService: ApiService = retrofit.create(ApiService::class.java)
}