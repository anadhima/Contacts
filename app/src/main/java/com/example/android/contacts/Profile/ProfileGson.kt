package com.example.android.contacts.Profile

import com.google.gson.annotations.SerializedName

data class ProfileGson(
@SerializedName("user")
    var usersObject: Array<String>,

    @SerializedName("locale")
    var locale: String,

    @SerializedName("profiles")
    var profiles: List<ProfileJson> = emptyList()

)

data class ProfileJson(

    @SerializedName("name")
    var name: String,

    @SerializedName("surname")
    var surname: String
)