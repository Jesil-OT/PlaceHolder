package com.jesil.exmaple.custom.placeholder.data.api

import com.jesil.exmaple.custom.placeholder.data.model.User
import com.jesil.exmaple.custom.placeholder.data.model.UserData
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface ApiService {

    // https://dummyapi.io/data/api/user

    //@Headers("app-id: app-id=6065a0406f046266dcbeaa1a")
    @GET("user")
    suspend fun getUsers(
      @Header("app-id" ) appId: String
    ) : User
}