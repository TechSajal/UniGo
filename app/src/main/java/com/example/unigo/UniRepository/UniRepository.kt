package com.example.unigo.UniRepository


import com.example.unigo.Model.University
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface UniRepository {

    @GET("search?country=india")
    suspend fun getUni(): Response<List<University>>

    companion object{
        operator fun invoke(): UniRepository {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://universities.hipolabs.com/")
                .build()
                .create(UniRepository::class.java)
        }
    }
}