package com.example.android.contacts.Profile

import com.google.gson.annotations.SerializedName

data class Users(

    @SerializedName("users")
    var users: List<UserDetails> = emptyList()

)

data class UserDetails(

   @SerializedName("name")
    var name: String = "",

    @SerializedName("surname")
    var surname: String = ""

)

/*

{
  "users": [
    {
      "name": "makis",
      "surname": "kontis"
    },
    {
      "name": "anna",
      "surname": "dhima"
    },
    {
      "name": "maria",
      "surname": "dhima"
    },
    {
      "name": "alex",
      "surname": "leni"
    }
  ]
}

 */