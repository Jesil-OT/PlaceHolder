package com.jesil.exmaple.custom.placeholder.data.model

import com.google.gson.annotations.SerializedName

data class User(

    @SerializedName("data")
    var data : List<UserData>,

    @SerializedName("total")
    var total : Int,

    @SerializedName("page")
    var page: Int,

    @SerializedName("limit")
    var limit: Int,

    @SerializedName("offset")
    var offset: Int
)