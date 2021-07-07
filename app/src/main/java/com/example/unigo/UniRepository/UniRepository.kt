package com.example.unigo.UniRepository

import com.example.unigo.Models.Uni
import com.example.unigo.Models.University
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface UniRepository {

    @GET("India")
    suspend fun getUni(): Response<Uni>

    companion object{
        operator fun invoke(): UniRepository {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://universities.hipolabs.com/search?country=")
                .build()
                .create(UniRepository::class.java)
        }
    }
}