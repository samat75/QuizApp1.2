package com.geektech.quizapp12.model


import com.google.gson.annotations.SerializedName

data class model(
    @SerializedName("response_code")
    val responseCode: Int,
    @SerializedName("results")
    val results: List<Result>
)