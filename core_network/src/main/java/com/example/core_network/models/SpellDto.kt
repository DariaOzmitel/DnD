package com.example.core_network.models

data class SpellDto(
    val id: String,
    val name: String,
    val nameEnglish: String,
    val sourceBooks: List<String>?,
    val level: Int,
    val school: String,
    val castingTime: String,
    val range: String,
    val components: String,
    val duration: String,
    val classes: List<String>,
    val description: String
)