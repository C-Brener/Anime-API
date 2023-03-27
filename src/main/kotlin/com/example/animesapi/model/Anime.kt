package com.example.animesapi.model

data class Anime(
    val name: String,
    val quantityEps: Int,
    val author: String,
    val imdbnote: String,
    val isFinished: Boolean,
    val characters: List<Character>
)
