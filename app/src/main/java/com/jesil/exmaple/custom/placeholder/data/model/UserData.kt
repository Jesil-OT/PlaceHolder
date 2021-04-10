package com.jesil.exmaple.custom.placeholder.data.model

import com.google.gson.annotations.SerializedName


data class UserData(

    @SerializedName("id")
    var id: String,

    @SerializedName("lastName")
    var lastName: String,

    @SerializedName("firstName")
    var firstName: String,

    @SerializedName("email")
    var email: String,

    @SerializedName("title")
    var title: String,

    @SerializedName("picture")
    var picture: String
)
{
    var name = (lastName + firstName)
}