package com.example.unigo.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



data class University (val web_pages:web,

                       val name:String,

                       @SerializedName("state-province")
                       @Expose
                       val stateprovince:String,

                       val country:String
                       )