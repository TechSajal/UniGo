package com.example.unigo.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data  class University (

    var name :String,
  var country :String,
    @SerializedName("state-province")
    @Expose
    var state_province:String,
    var alpha_two_code:String

)