package com.jesil.exmaple.custom.placeholder.di

import com.jesil.exmaple.custom.placeholder.data.api.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RetrofitModule {

    @Provides
    @Singleton
    fun provideRetrofit() : Retrofit =
        Retrofit.Builder()
            .baseUrl("https://dummyapi.io/data/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit) : ApiService =
        retrofit.create(ApiService::class.java)
}